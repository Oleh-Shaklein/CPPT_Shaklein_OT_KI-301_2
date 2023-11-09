package KI301.Shaklein.Lab5;

import java.io.*;
import java.util.*;

public class FileOperation {

    public static void main(String[] args) {
    	
        Trigonometry obj = new Trigonometry();
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Введіть значення x: ");
            double data = s.nextDouble();
            obj.calculate(data);
            System.out.println("Результат обчислення y = 1/sin(x) : " + obj.getResult());
            
        } catch (InputMismatchException ex) {
            System.out.println("Некоректне введення. Будь ласка, введіть коректне значення для x.");
            return;
        } catch (ArithmeticException ex) {
            System.out.println("Виникла помилка обчислення: " + ex.getMessage());
            return;
        }

        try {
            obj.writeResTxt("textReport.txt");
            obj.writeResBin("BinReport.bin");
            obj.readResBin("BinReport.bin");
            System.out.println("В бінарний файл записано результат: " + obj.getResult());
            obj.readResTxt("textReport.txt");
            System.out.println("В текстовий файл записано результат: " + obj.getResult());

        } catch (FileNotFoundException ex) {
            System.out.println("Помилка роботи з файлом: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Помилка вводу/виводу: " + ex.getMessage());
        }
    }
}

class Trigonometry {
    public void writeResTxt(String fName) throws FileNotFoundException {
        try (PrintWriter f = new PrintWriter(fName)) {
            f.printf("%f ", result);
        }
    }

    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                try (Scanner s = new Scanner(f)) {
                    result = s.nextDouble();
                }
            } else {
                throw new FileNotFoundException("Файл " + fName + " не знайдено");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        try (DataOutputStream f = new DataOutputStream(new FileOutputStream(fName))) {
            f.writeDouble(result);
        }
    }

    public void readResBin(String fName) throws FileNotFoundException, IOException {
        try (DataInputStream f = new DataInputStream(new FileInputStream(fName))) {
            result = f.readDouble();
        }
    }

    public double calculate(double x) {
        if (Math.sin(x) == 0) {
            throw new ArithmeticException("sin(x) дорівнює 0");
        }
        result = 1 / Math.sin(x);
        return result;
    }
    
    public double getResult() {
        return result;
    }

    private double result;
}

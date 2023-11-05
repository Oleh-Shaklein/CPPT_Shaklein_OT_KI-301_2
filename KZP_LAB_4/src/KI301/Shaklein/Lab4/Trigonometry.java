package KI301.Shaklein.Lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        try {
            System.out.print("Введіть значення x: ");
            x = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            logError("Неправильний формат вводу для x");
            System.out.print("Неправильний формат вводу для x");
            return;
        }

        double result = 0;

        try {
            result = calculateY(x);
            logMessage("Результат обчислення y = 1/sin(x) для x = " + x + ": " + result);
            System.out.println("Результат обчислення y = 1/sin(x) для x = " + x + ": " + result);
        } catch (ArithmeticException e) {
            logError("Помилка обчислення: " + e.getMessage());
            System.out.print("Помилка обчислення: " + e.getMessage());
            return;
        }

        writeReport("report.txt");
    }

    public static double calculateY(double x) throws ArithmeticException {
        if (Math.sin(x) == 0) {
            throw new ArithmeticException("sin(x) дорівнює 0");
        }
        return 1 / Math.sin(x);
    }

    public static void logError(String errorMessage) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt", true))) {
            writer.println("Помилка: " + errorMessage);
        } catch (IOException e) {
            System.err.println("Помилка запису до файлу: " + e.getMessage());
        }
    }
    
    public static void logMessage(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt", true))) {
            writer.println("Результат: " + message);
        } catch (IOException e) {
            System.err.println("Помилка запису до файлу: " + e.getMessage());
        }
    }

    public static void writeReport(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("Виконання програми завершено.");
        } catch (IOException e) {
            System.err.println("Помилка запису до файлу: " + e.getMessage());
        }
    }
}
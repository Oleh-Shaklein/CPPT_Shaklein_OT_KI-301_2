package KI301.Shaklein.lab2;

import java.io.*;
import java.util.Date;

import static java.lang.System.out;

class Conditioner {
    private String model;
    private int power;
    private double energyConsumption;
    private PrintWriter fout;

    public Conditioner(String model, int power, double energyConsumption) throws FileNotFoundException {
        this.model = model;
        this.power = power;
        this.energyConsumption = energyConsumption;
        fout = new PrintWriter(new File("протокол.txt"));
    }

    public Conditioner(String model) throws FileNotFoundException {
        this(model, 0, 0.0);
    }

    public void turnOn() {
        out.println(model + " включений.");
    }

    public void turnOff() {
        out.println(model + " вимкнений.");
    }

    public void setTemperature(int temperature) {
        out.println(model + ": Температура встановлена на " + temperature + " градусів.");
    }

    public void changeMode(String mode) {
        out.println(model + ": Режим роботи змінено на " + mode + ".");
    }

    public void logActivity(String action) {
        try (FileWriter fileWriter = new FileWriter("протокол.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter)) {
            Date date = new Date();
            printWriter.println(date.toString() + ": " + model + " - " + action);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dispose() {
        fout.close();
    }
}
package KI301.Shaklein.Lab3;

import java.io.*;
import java.util.Date;

public abstract class Conditioner {
	public String model;
    public int power;
    public double enCons;
    private PrintWriter logFile;

    public Conditioner(String model, int power, double enCons) throws FileNotFoundException {
        this.model = model;
        this.power = power;
        this.enCons = enCons;
        logFile = new PrintWriter(new File("протокол.txt"));
    }

    public Conditioner(String model) throws FileNotFoundException {
        this(model, 0, 0.0);
    }

    public Conditioner(int power) throws FileNotFoundException {
        this("Невідома модель", power, 0.0);
    }

    public void turnOn() {
        System.out.println(model + " включений.");
        logActivity("Ввімкнений кондиціонер");
    }

    public void turnOff() {
        System.out.println(model + " вимкнений.");
        logActivity("Вимкнений кондиціонер");
    }

    public void setTemperature(int temperature) {
        System.out.println(model + ": Температура встановлена на " + temperature + " градусів.");
        logActivity("Встановлена температуру на " + temperature + " градусів");
    }

    public void changeMode(String mode) {
        System.out.println(model + ": Режим роботи змінено на " + mode + ".");
        logActivity("Змінити режим на " + mode);
    }

    public void logActivity(String action) {
        Date date = new Date();
        logFile.println(date.toString() + ": " + model + " - " + action);
        logFile.flush();
    }

    public void dispose() {
        logFile.close();
    }
}

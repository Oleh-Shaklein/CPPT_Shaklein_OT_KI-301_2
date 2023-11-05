package KI301.Shaklein.lab2;

import java.io.*;
import static java.lang.System.out;

public class ConditionerApp {
    public static void main(String[] args) throws FileNotFoundException {
        Conditioner conditioner = new Conditioner("LG", 12000, 2.5);
        conditioner.turnOn();
        conditioner.setTemperature(22);
        conditioner.changeMode("Охолодження");
        conditioner.logActivity("Ввімкнути кондиціонер");
        conditioner.dispose();
    }
}
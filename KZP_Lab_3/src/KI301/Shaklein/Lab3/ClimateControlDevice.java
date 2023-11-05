package KI301.Shaklein.Lab3;

import java.io.*;

public class ClimateControlDevice extends Conditioner implements CC_Floor, CC_Timer, CC_Temperature {
    public ClimateControlDevice(String model, int power, double enCons) throws FileNotFoundException {
        super(model, power, enCons);
    }
    boolean isFloor;
    int TTemperature;
    
	@Override
    public void controlTemperature(int targetTemperature) {
		TTemperature = targetTemperature;
        System.out.println("Керуємо температурою до " + TTemperature + " градусів.");
        logActivity("Керуємо температурою до " + TTemperature + " градусів");
    }

	@Override
	public void FF_Avaiable() {
		isFloor = true;
	}

	@Override
	public void FF_NAvaiable() {
		isFloor = false;
	}

	@Override
	public boolean IsFloor() {
		return isFloor;
	}

	@Override
	public void FloorTemperature(int targetTemperature) {
		if (isFloor = true) {
			TTemperature = targetTemperature;
	        System.out.println("Керуємо температуру підлоги до " + TTemperature + " градусів.");
	        logActivity("Керуємо температуру підлоги до " + TTemperature + " градусів");
		}else{
			System.out.println("Вибачте, але підлога не доступна системі кліматконтролю");
	        logActivity("Пежим підігріву підлоги недоступний кліматконтролю");
		}
		
	}

	@Override
	public void setTimer(int minutes, int targetTemperature) {
		TTemperature = targetTemperature;
		System.out.println("Встановлюємо таймер на "+ minutes + " хвилин для досягнення " + targetTemperature + " градусів.");
	    logActivity("Встановлено таймер на " + minutes + " хвилин для досягнення " + targetTemperature + " градусів");
	}

	@Override
	public void setEnergySavingTimer(double enCons, int power, int targetTemperature) {
		TTemperature = targetTemperature;
		double Lminutes = enCons / power;
        System.out.println("Встановлюємо енергозберігаючий таймер на " + Lminutes + " хвилин для досягнення " + TTemperature + " градусів.");
        logActivity("Встановлено енергозберігаючий таймер на " + Lminutes + " хвилин для досягнення " + TTemperature + " градусів");
	}
}

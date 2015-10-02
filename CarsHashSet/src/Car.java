
/*
 * created by Gothbag <josemariacagigalso@gmail.com
 * this represents a car
 * 
 */

public class Car implements Comparable<Object> {
	
	private String make;
	private String model;
	private int engineDisplacement;
	private int nCylinders;
	private double fiscalHorsepower;
	
	public Car() {
		super();
	}

	public Car(String make, String model, int engineDisplacement,
		int nCylinders) {
		super();
		this.make = make;
		this.model = model;
		this.engineDisplacement = engineDisplacement;
		this.nCylinders = nCylinders;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEngineDisplacement() {
		return engineDisplacement;
	}
	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	public int getNCylinders() {
		return nCylinders;
	}
	public void setNCylinders(int nCylinders) {
		this.nCylinders = nCylinders;
	}
	public double getFiscalHorsepower() {
		return fiscalHorsepower;
	}
	public void setFiscalHorsepower(double fiscalHorsepower) {
		this.fiscalHorsepower = calcFiscalHorsepower();
		if (this.fiscalHorsepower == 0) {
			this.fiscalHorsepower = fiscalHorsepower;
		}
	}
	
	public double calcFiscalHorsepower() {
		return 0.08 * this.nCylinders * Math.pow(this.engineDisplacement / this.nCylinders, 0.6);
	}
	
	public String toString(){
		return this.getMake() + " " + this.getModel() + " " + this.getEngineDisplacement() + " " + this.getNCylinders();
		
	}

	@Override
	public int compareTo(Object obj2) {
		Car car2 = (Car) obj2;
		// a car with a larger engine displacement is better
		if (this.getEngineDisplacement() > car2.getEngineDisplacement()) {
			return 1;
			
		}
		if (this.getEngineDisplacement() < car2.getEngineDisplacement()) {
			return -1;
			
		}
		return 0;
	}

}

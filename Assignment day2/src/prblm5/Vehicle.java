package prblm5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassenger;
	private int model;
	private String make;

	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}

	public void display() {
		System.out.println("No of Wheels" + this.noOfWheel);
		System.out.println("No of Passenger" + this.noOfPassenger);
		System.out.println("Model" + this.model);
		System.out.println("Make" + this.make);
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}

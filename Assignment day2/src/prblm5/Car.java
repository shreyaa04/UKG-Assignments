package prblm5;

public class Car extends Vehicle {
	public Car(int noOfWheel, int noOfPassenger, int model, String make,int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
		// TODO Auto-generated constructor stub
	}

	private int noOfDoor;
	public void display()
	{
		System.out.println("No of Door" + this.noOfDoor);
		System.out.println("Model" + this.getModel());
		System.out.println("Make" + this.getMake());
	}
	public int getNoOfDoor() {
		return noOfDoor;
	}
	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}
	
	

}

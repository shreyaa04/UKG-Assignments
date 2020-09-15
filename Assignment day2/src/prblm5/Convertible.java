package prblm5;

public class Convertible extends Car{
	private boolean isHeadOpen;
	public boolean isHeadOpen() {
		return isHeadOpen;
	}


	public void setHeadOpen(boolean isHeadOpen) {
		this.isHeadOpen = isHeadOpen;
	}


	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor,boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHeadOpen = isHeadOpen;
		// TODO Auto-generated constructor stub
	}

	
	public void display()
	{
		super.display();
		System.out.println("Is the hood open :" + this.isHeadOpen);
	}
	

}

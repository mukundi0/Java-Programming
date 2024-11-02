package vehicles;

public class Scooter extends Motorcycle {
	
	private int wheels;
	
	public Scooter(String name, float price, int wheels) {
		super(name, price);
		this.wheels = wheels;
	}
	
	public void showDetails() {
		System.out.println("Name: "+this.getName());
		System.out.println("Price: "+this.getPrice());
		System.out.println("Wheels: "+wheels);
	}
}

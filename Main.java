package vehicles;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorcycle obj1 = new Motorcycle("Scuderia", 400000);
		Scooter obj2 = new Scooter("Lander", 300 , 3);
		
		obj1.showDetails();
		System.out.println("\n");
		obj2.showDetails();
	}

}

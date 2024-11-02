package shapes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj1 = new Circle (3);
		Cylinder obj2 = new Cylinder(20,40);
		
		System.out.println("Area and Perimeter of a Circle: \n");
		obj1.showDetails();
		System.out.println(" \n");
		System.out.println("Area and Perimeter of a Cylinder: \n");
		obj2.showDetails();
		
	}

}

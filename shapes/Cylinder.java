package shapes;

public class Cylinder extends Circle  {
	
	
	private int height;
	final double PI = 3.14;
	
	public Cylinder(int radius, int height) {
		super (radius);
		this.height = height;
	}
	public float getArea() {
		return (float) ((float) ((2 * PI * this.getRadius() * height)) + (2 * PI * this.getRadius() * this.getRadius()));
	}
	public float getPerimeter() {
		return 2*(2* this.getRadius() + height);
	}
	public void showDetails() {
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());
		

	}
}

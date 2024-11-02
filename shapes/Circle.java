package shapes;

public class Circle {
	private int radius;
	final double PI = 3.14;
	 
	public Circle(int radius) {
		this.radius = radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public float getArea() {
		return (float)PI * radius * radius;
		}
	public float getPerimeter() {
		return (float) ((float)2 * PI * radius);
	}
	public void showDetails() {
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());

	}
}
	
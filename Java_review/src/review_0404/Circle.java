package review_0404;

public class Circle {

	public double radius;
	public static double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}
	public static void main(String[] args) {
		
		Circle c = new Circle(3);
		System.out.println("원의 면적은 " + c.getArea());
		}

}

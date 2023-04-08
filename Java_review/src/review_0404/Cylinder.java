package review_0404;

public class Cylinder {
	public Circle c;
	public double height;
	
	public double getVolume() {
		return c.getArea() * height;
	}
	
	public Cylinder(Circle c, double height) {
		this.c = c;
		this.height = height;
		
	}
	
	public static void main(String[] args) {
//		Cylinder cylinder = new Cylinder();
//		cylinder.c = new Circle(2.8);
//		cylinder.height = 5.6;
//		System.out.println(cylinder.getVolume());
		
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cd.getVolume());
	}
}

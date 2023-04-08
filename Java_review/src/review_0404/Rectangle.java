package review_0404;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	};
	
	public double perimeter() {
		return 2 * (width + height);
	};
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.width = 8;
		rec.height = 5;
		
		System.out.println("사각형의 넓이 : " + rec.area());
		System.out.println("사각형의 둘레 : " + rec.perimeter());
		
		
	}
}

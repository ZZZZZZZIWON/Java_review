package review_0404;

public class Circle2 {
	double r;
	double cx;
	double cy;
	double PI = 3.14;
	
	public Circle2(double r, double cx, double cy) {
		this.r = r;
		this.cx = cx;
		this.cy = cy;
	};
	
	public double area() {
		return PI * r * r;
	};
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getCx() {
		return cx;
	}

	public void setCx(double cx) {
		this.cx = cx;
	}

	public double getCy() {
		return cy;
	}

	public void setCy(double cy) {
		this.cy = cy;
	}
	
	public static void main(String[] args) {
		
		Circle2 circleArea = new Circle2(3, 5, 6);
		System.out.printf("반지름 : %.1f\n원의 넓이 : %.2f", circleArea.getR(),circleArea.area());
		
	}
}

package homework_0412;

class Point {
	int X;
	int Y;

	public Point() {
	}

	String setXY(int X, int Y) {
		this.X = X;
		this.Y = Y;
		return "(" + X + ", " + Y + ")";

	}

	void move(int X, int Y) {
		setXY(X, Y);
	}

	void move(int X, int Y, int Z) {

	}
}

class ColorPoint extends Point {
	String color;

	ColorPoint() {
		this.color = "BLACK";
		setXY(0, 0);
	}

	ColorPoint(int X, int Y) {
		this.color = "BLACK";
		setXY(X, Y);
	}

	ColorPoint(int X, int Y, String color) {
		super();
		this.color = color;
		setXY(X, Y);
	}

	void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 " + "(" + X + ", " + Y + ")의 점";

	}
}

class Point3D extends Point {
	int Z;

	Point3D(int X, int Y, int Z) {
		setXY(X, Y);
		this.Z = Z;
	}

	void moveUp() {
		this.Z = Z;
		Z += 1;
	}

	void moveDown() {
		this.Z = Z;
		Z -= 1;
	}

	void move(int X, int Y) {
		setXY(X, Y);
	}

	@Override
	void move(int X, int Y, int Z) {
		super.move(X, Y);
		this.Z = Z;
	}

	@Override
	public String toString() {
		return "(" + X + ", " + Y + ", " + Z + ")";

	}
}

class PositivePoint extends Point {

	public PositivePoint() {
		super.move(X, Y);
	}

	public PositivePoint(int X, int Y) {
		super.move(X, Y);
		if (X < 0 || Y < 0) {
			this.X = 0;
			this.Y = 0;
		}
	}

	void move(int X, int Y) {
		if (X < 0 || Y < 0) {
			return;
		}
		super.move(X, Y);
	}

	@Override
	public String toString() {
		return "(" + X + ", " + Y + ")";
	}

}

public class ColorPointEx {

	public static void main(String[] args) {

//	5. Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 
//	다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

//	    ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//	    cp.setXY(10, 20);
//	    cp.setColor("RED");
//	    String str = cp.toString();
//	    System.out.println(str + "입니다.");

//	6. Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라.
//		다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

//		ColorPoint zeroPoint = new ColorPoint();
//		System.out.println(zeroPoint.toString() + "입니다.");
		//
//		ColorPoint cp = new ColorPoint(10, 10);
//		cp.setXY(5, 5);
//		cp.setColor("RED");
//		System.out.println(cp.toString() + "입니다.");

//	7. Point를 상속받아 3차원의 점을 나타내는 Point3D 클래스를 작성하라. 
//	다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

//		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3은 각각 x, y, z축의 값
//		System.out.println(p.toString() + "입니다.");
//
//		p.moveUp(); // z 축으로 위쪽 이동
//		System.out.println(p.toString() + "입니다.");
//
//		p.moveDown(); // z 축으로 아래쪽 이동
//		p.move(10, 10); // x, y 축으로 이동
//		System.out.println(p.toString() + "입니다.");
//
//		p.move(100, 200, 300); // x, y, z 축으로 이동
//		System.out.println(p.toString() + "입니다.");

//	8. Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라.
//	다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");

		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}

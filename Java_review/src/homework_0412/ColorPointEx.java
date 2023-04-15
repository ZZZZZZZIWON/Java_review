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
		return color + "���� " + "(" + X + ", " + Y + ")�� ��";

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

//	5. Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�. 
//	���� main() �޼ҵ带 �����ϰ� ���� ����� ���� ��µǰ� �϶�.

//	    ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//	    cp.setXY(10, 20);
//	    cp.setColor("RED");
//	    String str = cp.toString();
//	    System.out.println(str + "�Դϴ�.");

//	6. Point�� ��ӹ޾� ���� ���� ���� ��Ÿ���� ColorPoint Ŭ������ �ۼ��϶�.
//		���� main() �޼ҵ带 �����ϰ� ���� ����� ���� ��µǰ� �϶�.

//		ColorPoint zeroPoint = new ColorPoint();
//		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		//
//		ColorPoint cp = new ColorPoint(10, 10);
//		cp.setXY(5, 5);
//		cp.setColor("RED");
//		System.out.println(cp.toString() + "�Դϴ�.");

//	7. Point�� ��ӹ޾� 3������ ���� ��Ÿ���� Point3D Ŭ������ �ۼ��϶�. 
//	���� main() �޼ҵ带 �����ϰ� ���� ����� ���� ��µǰ� �϶�.

//		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3�� ���� x, y, z���� ��
//		System.out.println(p.toString() + "�Դϴ�.");
//
//		p.moveUp(); // z ������ ���� �̵�
//		System.out.println(p.toString() + "�Դϴ�.");
//
//		p.moveDown(); // z ������ �Ʒ��� �̵�
//		p.move(10, 10); // x, y ������ �̵�
//		System.out.println(p.toString() + "�Դϴ�.");
//
//		p.move(100, 200, 300); // x, y, z ������ �̵�
//		System.out.println(p.toString() + "�Դϴ�.");

//	8. Point�� ��ӹ޾� ����� ���������� ���� ��Ÿ���� PositivePoint Ŭ������ �ۼ��϶�.
//	���� main() �޼ҵ带 �����ϰ� ���� ����� ���� ��µǰ� �϶�.

		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "�Դϴ�.");

		p.move(-5, 5); // ��ü p�� ���� �������� �̵����� ����
		System.out.println(p.toString() + "�Դϴ�.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "�Դϴ�.");
	}

}

package review_0404;


public class Point {
	int x;
	int y;
	
	String set (int x, int y) {
		this.x = x;
		this.y = y;
		return  "("+ x +" , "+ y +")";
	};
	
	public static void main(String[] args) {
		Point point = new Point();
		System.out.println(point.set(5, 8));
	}
}

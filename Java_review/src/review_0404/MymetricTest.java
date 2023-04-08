package review_0404;

public class MymetricTest {
	public static void main(String[] args) {
		Mymetric myme = new Mymetric();
		myme.kilo = 5;
		System.out.printf("%.1f km : %.2f mi\n", myme.kilo, myme.kiloToMile());
		System.out.println();
		
		myme.mile = 8;
		System.out.printf("%.1f mi : %.2f km", myme.mile, myme.mileToKilo());
		
	}
}

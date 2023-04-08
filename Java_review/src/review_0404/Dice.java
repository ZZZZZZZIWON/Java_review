package review_0404;

public class Dice {
	int face;
	int roll() {
		return face = (int) (Math.random() * 6) + 1;
	};
	
	public static class DiceTest {
		public static void main(String[] args) {
			Dice dice = new Dice();
			System.out.println("주사위 숫자 : " + dice.roll());
		}
	}
}

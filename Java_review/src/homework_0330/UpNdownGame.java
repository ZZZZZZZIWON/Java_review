package homework_0330;

import java.util.Scanner;

public class UpNdownGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int card = 1 + (int) (Math.random() * 100);
			System.out.print("Guess the number");
			System.out.printf("(card:" + card + ")");
			System.out.println();
			int num = 0;
			int min = 0;
			int max = 99;
			int count = 0;

			while (num != card) {
				System.out.printf("from %d to %d", min, max);
				System.out.println();
				count++;
				System.out.printf("%d>>", count);
				num = scan.nextInt();

				if (num > card) {
					System.out.println("DOWN");
					max = num - 1;
				} else if (num < card) {
					System.out.println("UP");
					min = num + 1;
				}

				else {
					System.out.println("CORRECT!");
				}
			}
			System.out.print("PLAY AGAIN?(y/n)>>");
			String yn;

			yn = scan.next();
			if (!yn.equals("y")) {
				break;
			}
		}
		System.out.println("GAME OVER");

	}

}

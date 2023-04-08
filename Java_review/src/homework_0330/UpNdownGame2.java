package homework_0330;

import java.util.Scanner;

public class UpNdownGame2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int card = 1 + (int) (Math.random() * 100);
			System.out.print("Guess the number\n");
			//System.out.printf("(card:" + card + ")");
			int num = 0;
			int min = 0;
			int max = 99;
			int count = 0;

			while (true) {
				if(num == card) {
					System.out.println("CORRECT!");
					break;
				}
				
				if (max - min == 1) {
					System.out.printf("%d or %d", min, max);
					System.out.println();
				} else if(max-min == 0) {
					System.out.println();
				} else {
					System.out.printf("from %d to %d", min, max);
					System.out.println();
				}
				
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

			}
			
			System.out.print("PLAY AGAIN?(Y/N)>>");
			String yn;

			yn = scan.next();
			if (!yn.equals("Y")) {
				break;
			}
		}
		System.out.println("GAME OVER");

	}

}

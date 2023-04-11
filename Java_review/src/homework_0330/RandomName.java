package homework_0330;

import java.util.Scanner;

public class RandomName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] Names = { "김여원", "김정현", "김준성", "김초봄", "박규리", "박민규", "박슬기", "박주연", "박지원", "심소영", "오연경", "윤진수", "이성진",
				"이유진", "이태형", "전병남", "정성호", "정승복", "정웅기", "조아름", "최지현" };

		System.out.print("몇 명을 뽑을까요? >> ");
		int numOfPeople = scan.nextInt();

		for (int i = 0; i < numOfPeople; i++) {
			int selected = 1+(int) (Math.random() * 21); 
			System.out.println(Names[selected] + " "); 
		}

	}
}

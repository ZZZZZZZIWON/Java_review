package homework_0330;

import java.util.Scanner;

public class RandomName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] Names = { "�迩��", "������", "���ؼ�", "���ʺ�", "�ڱԸ�", "�ڹα�", "�ڽ���", "���ֿ�", "������", "�ɼҿ�", "������", "������", "�̼���",
				"������", "������", "������", "����ȣ", "���º�", "������", "���Ƹ�", "������" };

		System.out.print("�� ���� �������? >> ");
		int numOfPeople = scan.nextInt();

		for (int i = 0; i < numOfPeople; i++) {
			int selected = 1 + (int) (Math.random() * 21); 
			System.out.println(Names[selected] + " "); 
		}

	}
}

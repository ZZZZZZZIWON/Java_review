package homework_0330;

import java.util.Scanner;

public class RandomName_JW {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] Names = { "�迩��", "������", "���ؼ�", "���ʺ�", "�ڱԸ�", "�ڹα�", "�ڽ���", "���ֿ�", "������", "�ɼҿ�", "������", "������", "�̼���",
				"������", "������", "������", "����ȣ", "���º�", "������", "���Ƹ�", "������" };

		System.out.print("�� ���� �������? >> ");
		int numOfPeople = scan.nextInt();

		int[] selected = new int[numOfPeople];
		for (int i = 0; i < numOfPeople; i++) {
			int num = 1 + (int) (Math.random() * 21);
			for(int j=0; j<i; j++)
				if(selected[j] == num) i--;			 
		}
		
		for (int i=0; i < selected.length; i++)
			System.out.println(Names[i]);
	}
}

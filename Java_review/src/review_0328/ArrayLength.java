package review_0328;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {

		int intArray[] = new int[5];
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ���>>");

		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scan.nextInt();

		for (int i = 0; i < intArray.length; i++)
			sum = sum + intArray[i];

		System.out.println("����� " + (double)sum / intArray.length);
	}

}

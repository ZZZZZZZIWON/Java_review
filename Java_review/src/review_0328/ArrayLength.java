package review_0328;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {

		int intArray[] = new int[5];
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");

		for (int i = 0; i < intArray.length; i++)
			intArray[i] = scan.nextInt();

		for (int i = 0; i < intArray.length; i++)
			sum = sum + intArray[i];

		System.out.println("평균은 " + (double)sum / intArray.length);
	}

}

package review_0328;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int intArray[] = new int[5];
		int max = 0;
		
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i = 0; i<5; i++) {
		intArray[i] = scan.nextInt();
		if(intArray[i]>max)
			max = intArray[i];
		}
		System.out.println("���� ū ���� = "+ max);
	}

}

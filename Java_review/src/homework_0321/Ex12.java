package homework_0321;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("����>>");
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		int result =0;

		if (op.equals("+"))
			result = a + b;
		else if (op.equals("-"))
			result = a - b;
		else if (op.equals("*"))
			result = a * b;
		else if (op.equals("/")) {
			if (b == 0)
				System.out.println("0���� ���� �� �����ϴ�.");
			else
				result = a / b;
		} 
		
		System.out.println(a + op + b + "�� ��� ����� " + result);

		scan.close();

	}

}

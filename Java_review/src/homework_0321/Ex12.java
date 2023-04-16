package homework_0321;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("연산>>");
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
				System.out.println("0으로 나눌 수 없습니다.");
			else
				result = a / b;
		} 
		
		System.out.println(a + op + b + "의 계산 결과는 " + result);

		scan.close();

	}

}

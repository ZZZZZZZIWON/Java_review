package homework_0321;

import java.util.Scanner;

public class Ex12_2{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산>>");
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		int result=0;
		
		switch(op) {
			case "+":
				result = a+b;
				break;
			case "-":
				result = a-b;
				break;
			case "*":
				result = a*b;
				break;
			case "/":
				if(b==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				else
				result = a/b;
				break;
			
		}
		System.out.println(a+op+b+"의 계산 결과는 "+result);
		scan.close();
		

	}

	}

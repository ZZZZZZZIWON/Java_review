package homework_0321;

import java.util.Scanner;

public class Ex12_2{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����>>");
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
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				else
				result = a/b;
				break;
			
		}
		System.out.println(a+op+b+"�� ��� ����� "+result);
		scan.close();
		

	}

	}

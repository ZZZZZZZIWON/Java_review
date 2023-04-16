package homework_0321;

import java.util.Scanner;

public class Ex11{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scan.nextInt();
		
		if(month>=3&&month<=5)
			    System.out.print("봄");
			else if(month>=6&&month<=8) 
				System.out.print("여름");
			else if(month>=9&&month<=11)
				System.out.print("가을");
		else
				System.out.print("겨울");
		
		scan.close();
		

	}

	}

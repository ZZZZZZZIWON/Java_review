package homework_0321;

import java.util.Scanner;

public class Ex11{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int month = scan.nextInt();
		
		if(month>=3&&month<=5)
			    System.out.print("��");
			else if(month>=6&&month<=8) 
				System.out.print("����");
			else if(month>=9&&month<=11)
				System.out.print("����");
		else
				System.out.print("�ܿ�");
		
		scan.close();
		

	}

	}

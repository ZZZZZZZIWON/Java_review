package homework_0321;

import java.util.Scanner;

public class Ex10{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>>");
		double fCenx = scan.nextDouble();
		double fCeny = scan.nextDouble();
		double fHalf = scan.nextDouble();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>>");
		double sCenx = scan.nextDouble();
		double sCeny = scan.nextDouble();
		double sHalf = scan.nextDouble();
		
		if((sCenx-sHalf > 2*fCenx)&&(sCeny-sHalf > 2*fCeny)) 
		
		System.out.println("�� ���� ���� ��ģ��.");
			
		else
	
		System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		scan.close();

	}

	}

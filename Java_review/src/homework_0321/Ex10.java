package homework_0321;

import java.util.Scanner;

public class Ex10{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		double fCenx = scan.nextDouble();
		double fCeny = scan.nextDouble();
		double fHalf = scan.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		double sCenx = scan.nextDouble();
		double sCeny = scan.nextDouble();
		double sHalf = scan.nextDouble();
		
		if((sCenx-sHalf > 2*fCenx)&&(sCeny-sHalf > 2*fCeny)) 
		
		System.out.println("두 원은 서로 겹친다.");
			
		else
	
		System.out.println("두 원은 서로 겹치지 않는다.");
		
		scan.close();

	}

	}

package review_0328;

import java.util.Scanner;

public class BinerySearch {

	public static void main(String[] args) {
		int LottoNum[] = { 45, 10, 3, 33, 36, 24, 38 };
		
		for (int i = 0; i < LottoNum.length; i++) {
			int min = LottoNum[i];
			int min_index = i;

			for (int j = i + 1; j < LottoNum.length; j++) {

				if (min > LottoNum[j]) {
					min = LottoNum[j];
					min_index = j;
				}
			}
			int temp = LottoNum[min_index];
			LottoNum[min_index] = LottoNum[i];
			LottoNum[i] = temp;
		}
		for(int n : LottoNum)
			System.out.print(n+ " ");
			System.out.println();
			
		Scanner scan = new Scanner(System.in);

		int low = 0, high = 6;
		int mid = 0;

		System.out.print("�˻��� ���� �Է��ϼ���>> ");
		int num = scan.nextInt();
		int num_index = -1;

		while (low <= high) {
			mid = (low + high) / 2;

			if (num == LottoNum[mid]) {
				num_index = mid;
				break;
			} else if (num > LottoNum[mid]) {
				low = mid + 1;
			} else if (num < LottoNum[mid]) {
				high = mid - 1;
			}
		}
		if (num_index == -1)
			System.out.println("�Է��� ���� �迭�� �������� �ʽ��ϴ�.");
		else
			System.out.println("�Է��� ���� " + num_index + "�� �ε����� �ֽ��ϴ�.");
	}

}

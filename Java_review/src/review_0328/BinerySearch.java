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

		System.out.print("검색할 값을 입력하세요>> ");
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
			System.out.println("입력한 값이 배열에 존재하지 않습니다.");
		else
			System.out.println("입력한 값은 " + num_index + "번 인덱스에 있습니다.");
	}

}

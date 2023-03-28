package review_0328;

public class SelectionSort {

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
		for(int num : LottoNum)
		System.out.print(num + " ");
	}

}

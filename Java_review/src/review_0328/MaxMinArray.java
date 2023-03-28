package review_0328;

public class MaxMinArray {

	public static void main(String[] args) {
		int LottoNum[] = { 45, 10, 33, 3, 36, 24, 38 };

		int max = LottoNum[0];
		int min = LottoNum[0];

		for (int i = 1; i < LottoNum.length; i++) {
			if(LottoNum[i]>max)
				max = LottoNum[i];
			else if(LottoNum[i]<min)
				min = LottoNum[i];
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}

}

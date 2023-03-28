package review_0328;

public class LottoNumber {

	public static void main(String[] args) {
		int lotto_num[] = new int [7];
		
		for(int i = 0; i < 7; i++) {
			lotto_num[i] = 1+(int)(Math.random()*45);

			for(int j = 0; j < i; j++)
				if(lotto_num[i] == lotto_num[j])
					i--;
		}
		for(int n:lotto_num)
		System.out.print(n+" ");
		System.out.println();
		
		for (int k = 0; k < lotto_num.length; k++) {
			int min = lotto_num[k];
			int min_index = k;

			for (int l = k + 1; l < lotto_num.length; l++) {

				if (min > lotto_num[l]) {
					min = lotto_num[l];
					min_index = l;
				}
			}
			int temp = lotto_num[min_index];
			lotto_num[min_index] = lotto_num[k];
			lotto_num[k] = temp;
		}
		for(int N : lotto_num)
		System.out.print(N + " ");
	}

}

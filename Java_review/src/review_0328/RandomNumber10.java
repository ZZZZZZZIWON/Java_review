package review_0328;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber10 {

	public static void main(String[] args) {

		int Random_num[] = new int[10];

		for (int i = 0; i < 10; i++) {
			Random_num[i] = 1 + (int) (Math.random() * 10);
			for (int j = 0; j < i; j++)
				if (Random_num[i] == Random_num[j])
					i--;
		}
			for(int num : Random_num)
			System.out.print(num+ " ");
			System.out.println();
			//최댓값 구하기
			int max = 0;
			int max_index = 0;
			for(int k = 0; k < 10; k++) {
				if(max < Random_num[k])
					max = Random_num[k];
					max_index = k;
			}
			System.out.print("max = "+max);
	}

}

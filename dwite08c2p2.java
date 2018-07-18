package problems;

import java.util.Scanner;

public class dwite08c2p2 {
	
	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int[] input = new int[5];
		int[] output = new int[5];
		int big;
		for(int i = 0;i < 5;i++) {
			input[i] = sc.nextInt();
		}
		
		for(int j = 0;j < 5;j++) {
			if (input[j] == 0) {
				output[j] = 0;
			} else {
				big = 0;
				int x = input[j];
				while (x > 0) {
					if (x % 10 > big) {
						big = x % 10;
					}
					x = x / 10;
				}
				output[j] = big;
			}
		}
		
		for(int k = 0;k < 5;k++) {
			System.out.println(output[k]);
		}
		
		
	}
}

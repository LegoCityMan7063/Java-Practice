package problems;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ccc17s2 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n;
		Integer[] input = new Integer[m];
		
		if (input.length % 2 == 0) {
			n = input.length / 2;
		} else {
			n = input.length / 2 + 1;
		}
		
		for (int i = 0;i < m;i++) {
			input[i] = sc.nextInt();
		}
		
		Arrays.sort(input);
		//System.out.println(Arrays.toString(input));
		
		Integer[] low = Arrays.copyOfRange(input, 0, n);
		Integer[] high = Arrays.copyOfRange(input, n, m);
		
		Arrays.sort(low, Collections.reverseOrder());
		Arrays.sort(high);
		
		//System.out.println(Arrays.toString(low));
		//System.out.println(Arrays.toString(high));
		
		if (input.length % 2 == 0) {
			for (int k = 0;k < n;k++) {
				System.out.print(low[k] + " " + high[k] + " ");
			}
		} else {
			for (int l = 0;l < n;l++) {
				if (l == n - 1) {
					System.out.print(low[l]);
				} else {
					System.out.print(low[l] + " " + high[l] + " ");
				}
			}
		}
		
		
		
		sc.close();
	}
}

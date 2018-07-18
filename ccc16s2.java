package problems;

import java.util.Scanner;
import java.util.Arrays;

public class ccc16s2 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args){
		int q = sc.nextInt();
		int n = sc.nextInt();
		int[] d = new int[n];
		int[] p = new int[n];
		int min = 0;
		int max = 0;
		for (int i = 0;i < n;i++) {
			d[i] = sc.nextInt();
		}
		for (int i = 0;i < n;i++) {
			 p[i] = sc.nextInt();
		}
		Arrays.sort(d);
		Arrays.sort(p);
		if (q == 1) {
			for (int i = 0;i < n;i++) {
				if (d[i] >= p[i]) {
					min+=d[i];
				} else {
					min+=p[i];
				}
			}
			System.out.println(min);
		} else {
			for (int i = 0;i < n / 2;i++) {
				int temp = d[i];
				d[i] = d[n - i - 1];
				d[n - i - 1] = temp;
			}
			for (int i = 0;i < n;i++) {
				if (d[i] >= p[i]) {
					max+=d[i];
				} else {
					max+=p[i];
				} 
			}
			System.out.println(max);
		}
		
	}
}

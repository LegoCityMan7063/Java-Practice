package problems;

import java.util.Scanner;

public class ccc17s1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int n = sc.nextInt();
		int[] swifts = new int[n];
		int[] semaphores = new int[n];
		int s1 = 0;
		int s2 = 0;
		for (int i = 0;i < n;i++) {
			swifts[i] = sc.nextInt();
		}
		for (int j = 0;j < n;j++) {
			semaphores[j] = sc.nextInt();
		}
		int k = 0;
		for (int l = 0;l < n;l++) {
			s1 += swifts[l];
			s2 += semaphores[l];
			if (s1 == s2) {
				k = l + 1;
			}
		}
		System.out.println(k);
	}
}

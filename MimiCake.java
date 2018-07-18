package problems;

import java.util.Scanner;

public class MimiCake {
	public static Scanner sc = new Scanner (System.in);
	public static boolean isPrime(int f) {
		if (f == 2) {
			return true;
		} else if (f == 1 || f % 2 == 0) {
			return false;
		} else {
			for (int i = 3;i * i <= f;i+=2) {
				if (f % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	public static void main (String[] args) {
		int n = sc.nextInt();
		int[] f = new int[n];
		for (int i = 0;i < n;i++) {
			f[i] = sc.nextInt();
		}
		int counter = 0;
		for (int i = 0; i < n;i++) {
			if (isPrime(f[i])) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}

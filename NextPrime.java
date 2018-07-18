package problems;

import java.util.Scanner;

public class NextPrime {

	public static Scanner sc = new Scanner (System.in);
	public static boolean isPrime(int number) {
		if (number == 2) {
			return true;
		} else if (number == 1) {
			return false;
		} else if (number % 2 == 0) {
			return false;
		} else {
			for (int i = 3;i * i <= number;i+=2) {
				if (number % i == 0) {
					return false;
				} 
			}
			return true;
		}
		
	}
	public static void main (String[] args) {
		int n = sc.nextInt();
		for (;;n++) {
			isPrime(n);
			if (isPrime(n) == true) {
				System.out.println(n);
				System.exit(0);
			}
		}
	}
}

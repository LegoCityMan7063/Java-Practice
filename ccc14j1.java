package problems;

import java.util.Scanner;

public class ccc14j1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a + b + c != 180) {
			System.out.println("Error");
			System.exit(0);
		}
		if (a == 60 && b == 60) {
			System.out.println("Equilateral");
		} else if ((a == b || b == c || a == c)) {
			System.out.println("Isosceles");
		} else if (a != b && b != c && a != c) {
			System.out.println("Scalene");
		}
	}
}

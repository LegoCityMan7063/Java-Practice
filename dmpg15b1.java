package problems;

import java.util.Scanner;

public class dmpg15b1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int n = sc.nextInt();
		String[] numbers = new String[n];
		for (int i = 0;i < n;i++) {
			numbers[i] = sc.next();
		}
		for (int i = 0;i < n;i++) {
			if (numbers[i].length() != 10) {
				System.out.println("not a phone number");
			} else {
				System.out.println("(" + numbers[i].substring(0, 3) + ")-" + numbers[i].substring(3, 6) + "-" + numbers[i].substring(6, 10));
			}
		}
	}
}

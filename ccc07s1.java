package problems;

import java.util.Scanner;
//2007-2-27
public class ccc07s1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			if (y < 1989 || y == 1989 && m == 2 && d <= 27 || y == 1989 && m < 2) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}

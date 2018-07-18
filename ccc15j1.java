package problems;

import java.util.Scanner;
//2-18
public class ccc15j1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int m = sc.nextInt();
		int d = sc.nextInt();	
		
		if (m < 2 || m == 2 && d < 18) {
			System.out.println("Before");
		} else if (m == 2 && d == 18) {
			System.out.println("Special");
		} else {
			System.out.println("After");
		}
	}
}

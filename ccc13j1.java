package problems;

import java.util.Scanner;

public class ccc13j1 {
	
	public static Scanner in = new Scanner (System.in);
	public static void main (String[] args) {
		int a = in.nextInt();
		int b = in.nextInt();
		int c = b + (b - a);
		System.out.println(c);
		
	}
}

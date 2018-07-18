package problems;

import java.util.Scanner;

public class ccc04j1 {
	
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		double a = sc.nextDouble();
		int b = (int) Math.sqrt(a);
		System.out.println("The largest square has side length " + b + ".");
	}
}

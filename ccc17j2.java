package problems;

import java.util.Scanner;
import java.lang.Math;
public class ccc17j2 {
	
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int sum = n;
		
		for (int i = 1; i <= k;i++) {
			sum += n * Math.pow(10, i);
		}
		
		System.out.println(sum);
	}
}

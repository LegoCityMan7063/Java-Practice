package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Sss {
	
	public static int N;
	public static int[] A;
	
	public static boolean getBit(int n, int idx) {
		return ((1 << n) & idx) > 0;
	}
	
	public static int getSum(int mask) {
		int sum = 0;
		
		for (int i=0;i < N; i++) {
					if (getBit(mask, i)) {
						sum += A[i];
					}
		}
		
		return sum;
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		A = new int[N];
		
		
		
		sc.close();
	}
}

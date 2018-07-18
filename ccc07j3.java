package problems;

//import java.io.*;
import java.util.Scanner;
//import java.util.Arrays;

public class ccc07j3 {

	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args){
		int n = sc.nextInt();
		Integer[] cases = {0, 100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		Integer[] input = new Integer[n];
		int sum = 1691600;
		for (int i = 0; i < n;i++) {
			input[i] = sc.nextInt();
			sum -= cases[input[i]];
		}
		int average = sum / (10 - n);
		//System.out.println(sum);
		//System.out.println(average);
		int banker = sc.nextInt();
		if ( banker > average) {
			System.out.println("deal");
		} else {
			System.out.println("no deal");
		}
		
	}
}

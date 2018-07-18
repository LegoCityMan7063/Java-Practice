package problems;

import java.util.Scanner;
//import java.util.Arrays;

public class ccc16j1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		String[] input = new String[6];
		for (int i = 0;i < 6;i++) {
			input[i] = sc.nextLine();
		}
		int win = 0;
		for (int j = 0;j < 6;j++) {
			if (input[j].equals("W")) {
				win++;
			}
		}
		//System.out.println(Arrays.toString(input));
		//System.out.println(win);
		if (win >= 5) {
			System.out.println("1");
		} else if (win >= 3) {
			System.out.println("2");
		} else if (win >= 1) {
			System.out.println("3");
		} else {
			System.out.println("-1");
		}
	}
}

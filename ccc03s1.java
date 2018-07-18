package problems;

import java.io.*;

public class ccc03s1 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws NumberFormatException, IOException {
		int square = 1;
		int input;
		while (square <= 100) {
			input = Integer.parseInt(in.readLine());
			if (input == 0) {
				System.out.println("You Quit!");
				System.exit(0);
			}
			if (square + input <= 100) {
				square += input;
				if (square == 100) {
					System.out.println("You are now on square 100");
					System.out.println("You Win!");
					System.exit(0);
				}
			}
			if (square == 9) {
				square = 34;
			} else if (square == 40) {
				square = 64;
			} else if (square == 67) {
				square = 86;
			} else if (square == 54) {			
				square = 19;
			} else if (square == 54) {			
				square = 19;
			} else if (square == 90) {			
				square = 48;
			} else if (square == 99) {			
				square = 77;
			}
			if (square < 100) {
				System.out.println("You are now on square " + square);
			}
		}
	}
}

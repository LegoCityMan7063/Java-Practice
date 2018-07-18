package problems;

import java.io.*;

public class ccc12j1 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws NumberFormatException, IOException {
		int limit = Integer.parseInt(in.readLine());
		int s = Integer.parseInt(in.readLine());
		if (s <= limit) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else {
			if ( s - limit <= 20) {
				System.out.println("You are speeding and your fine is $100.");
			} else if (s - limit <= 30) {
				System.out.println("You are speeding and your fine is $270.");
			} else {
				System.out.println("You are speeding and your fine is $500.");
			}
		}
	}
}

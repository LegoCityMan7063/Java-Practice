package problems;

import java.io.*;

public class Boolean {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int counter = 0;
		for (int i = 0;i < tokens.length;i++) {
			if (tokens[i].equals("not")) {
				counter++;
			}
		}
		if (counter % 2 == 0 && tokens[tokens.length - 1].equals("True")) {
			System.out.println("True");
		} else if (counter % 2 != 0 && tokens[tokens.length - 1].equals("True")) {
			System.out.println("False");
		} else if (counter % 2 == 0 && tokens[tokens.length - 1].equals("False")) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
	}
	
}
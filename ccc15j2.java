package problems;

import java.io.*;

public class ccc15j2 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		String input = in.readLine();
		int happy = 0;
		int sad = 0;
		for (int i = 0;i < input.length();i++) {
			if (input.charAt(i) == ':' && input.charAt(i+1) == '-' ) {
				if (input.charAt(i+2) == ')') {
					happy++;
				} else if (input.charAt(i+2) == '(') {
					sad++;
				}
			}
		}
		if (happy == 0 && sad == 0) {
			System.out.println("none");
		} else if (happy == sad) {
			System.out.println("unsure");
		} else if (happy > sad) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
	}
}

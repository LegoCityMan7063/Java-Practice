package problems;

import java.io.*;

public class ccc11s1 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(in.readLine());
		String[] input = new String[n];
		int english = 0;
		int french = 0;
		for (int i = 0;i < n;i++) {
			input[i] = in.readLine();
		}
		for (int i = 0;i < n;i++) {
			for (int j = 0;j < input[i].length();j++) {
				if (input[i].charAt(j) == 't' || input[i].charAt(j) == 'T') {
					english++;
				} else if (input[i].charAt(j) == 's' || input[i].charAt(j) == 'S') {
					french++;
				}
			}
		}
		if (english > french) {
			System.out.println("English");
		} else if (english < french) {
			System.out.println("French");
		} else {
			System.out.println("French");
		}
	}
}

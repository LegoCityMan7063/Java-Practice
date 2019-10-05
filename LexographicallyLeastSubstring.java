package examples;

import java.io.*;

public class LexographicallyLeastSubstring {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		String input = in.readLine();
		int length = Integer.parseInt(in.readLine());
		String smallest = " ";
		for (int i = 0;i < input.length() - length;i++) {
			String substring = input.substring(i,i+length);
			if (i == 0) {
				smallest = substring;
			}
			if (substring.compareTo(smallest) < 0) {
				smallest = substring;
			}
		}
		System.out.println(smallest);
	}
}

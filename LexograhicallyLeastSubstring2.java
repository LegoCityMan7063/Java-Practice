package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LexograhicallyLeastSubstring2 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		String input = in.readLine();
		int least = Integer.parseInt(in.readLine());
		String substring = "|";
		for (int i = 0;i < input.length();i++) {
			if (i + least < input.length() && input.substring(i, i + least).compareTo(substring) < 1) {
				substring = input.substring(i,i + least);
			}
		}
		System.out.println(substring);
	}
}

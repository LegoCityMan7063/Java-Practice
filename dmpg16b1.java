package problems;

import java.io.*;

public class dmpg16b1 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int n = Integer.parseInt(tokens[0]) * 5;
		int d = Integer.parseInt(tokens[1]) * 10;
		int q = Integer.parseInt(tokens[2]) * 25;
		int l = Integer.parseInt(tokens[3]) * 100;
		int t = Integer.parseInt(tokens[4]) * 200;
		System.out.println(n + d + q + l + t);
	}
}

package problems;

import java.io.*;

public class ccc06j2 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		int m = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		int c = 0;
		for (int i = 1;i <= m;i++) {
			for (int j = 1;j <= n;j++) {
				if (i + j == 10) {
					c++;
				}
			}
		}
		if (c == 1) {
			System.out.println("There is 1 way to get the sum 10.");
		} else {
			System.out.format("There are %d ways to get the sum 10.",c);
		}
	}
}

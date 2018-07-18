package problems;

import java.io.*;

public class ccc11s2 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(in.readLine());
		String[] m = new String[n*2];
		int right = 0;
		for (int i = 0;i < 2 * n;i++) {
			m[i] = in.readLine();
		}
		for (int i = 0;i < n;i++) {
			if (m[i].equals(m[i + n])) {
				right++;
			}
		}
		System.out.println(right);
	}
}

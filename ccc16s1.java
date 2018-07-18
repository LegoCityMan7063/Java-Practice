package problems;

import java.io.*;

public class ccc16s1 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		String a = in.readLine();
		String b = in.readLine();
		int[] count = new int[200];
		int wild = 0;
		int diff = 0;
		for (int i = 0;i < a.length();i++) {
			count[a.charAt(i)]++;
			if (b.charAt(i) == '*') {
				wild++;
			} else {
				count[b.charAt(i)]--;
			}
		}
		for (int i = 0; i < count.length;i++) {
			diff += Math.abs(count[i]);
		}
		if (diff == wild) {
			System.out.println("A");
		} else {
			System.out.println("N");
		}
	}
}

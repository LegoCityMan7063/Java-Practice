package problems;

import java.io.*;

public class ccc02s2 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static int numerator(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return numerator(b, a % b);
		}
	}
	public static void main (String[] args) throws IOException {
		int a = Integer.parseInt(in.readLine());
		int b = Integer.parseInt(in.readLine());
		if (a % b == 0) {
			System.out.println(a / b);
		} else {
			int g = numerator(a,b);
			a /= g;
			b /= g;
			if (a > b) {
				int n = a / b;
				a -= b * n;
				System.out.println(n + " " + a + "/" + b);
			} else {
				System.out.println(a + "/" + b);
			}
		}
	}
}

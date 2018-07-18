package problems;

import java.io.*;

public class ccc13j2 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static boolean check (String a,int b) {
		if (a.charAt(b) == 'I' ||a.charAt(b) == 'O' ||a.charAt(b) == 'S' ||a.charAt(b) == 'H' ||a.charAt(b) == 'Z' ||a.charAt(b) == 'X' ||a.charAt(b) == 'N') {
			return true;
		} else {
			return false;
		}
	}
	public static void main (String[] args) throws IOException {
		String a = in.readLine();
		for (int i = 0;i < a.length();i++) {
			if (check(a,i) == false) {
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println("YES");
	}
}

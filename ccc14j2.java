package problems;

import java.io.*;

public class ccc14j2 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws NumberFormatException, IOException {
		int v = Integer.parseInt(in.readLine());
		String votes = in.readLine();
		int ca = 0;
		int cb = 0;
		
		for (int i = 0;i < v;i++) {
			if (votes.charAt(i) == 'A') {
				ca++;
			} else {
				cb++;
			}
		}
		//System.out.println(ca);
		//System.out.println(cb);
		if (ca > cb) {
			System.out.println("A");
		} else if (ca == cb) {
			System.out.println("Tie");
		} else {
			System.out.println("B");
		}
	}
}

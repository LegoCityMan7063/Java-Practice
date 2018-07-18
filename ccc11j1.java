package problems;

import java.io.*;

public class ccc11j1 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws NumberFormatException, IOException {
		int a = Integer.parseInt(in.readLine());
		int e = Integer.parseInt(in.readLine());
		if (a >= 3 && e <= 4) {
			System.out.println("TroyMartian");
		} 
		if (a <= 6 && e >= 2) {
			System.out.println("VladSaturnian");
		}
		if (a <= 2 && e <= 3) {
			System.out.println("GraemeMercurian");
		}
	}
}

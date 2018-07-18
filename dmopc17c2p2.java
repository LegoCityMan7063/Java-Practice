package problems;

import java.util.Scanner;

public class dmopc17c2p2 {
	
	public static boolean check(String S) {
		int counter=0;
		boolean done = false;
		for (int i=0;i< S.length();i++) {
			if (S.charAt(i) == '(') {
				counter++;				
			} else {
				if (counter > 0 ) {
					counter--;
				} else {
					if (done) return false;
					done = true;
					counter++;
				}
			}
		}	
		if (counter == 0 || !done && counter == 2) {
			return true;
		}
		return false;
		
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String s = sc.next();
		
		if (check(s) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}

package problems;

import java.util.Scanner;
import java.util.ArrayList;

public class ccc15s1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int k = sc.nextInt();
		int input;
		int sum = 0;
		ArrayList<Integer> n = new ArrayList<Integer>();
		for (int i = 0;i < k;i++) {
			input = sc.nextInt();
			if (input != 0) {
				n.add(0,input);
			} else {
				n.remove(0);
			}
			//System.out.println(n.toString());
		}
		for (int i = 0;i < n.size();i++) {
			sum += n.get(i);
		}
		System.out.println(sum);
	}	
}

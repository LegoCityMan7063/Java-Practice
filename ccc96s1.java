package problems;
import java.util.Scanner;
public class ccc96s1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int m = sc.nextInt();
		int[] n = new int[m];
		for (int i = 0;i < m;i++) {
			n[i] = sc.nextInt();
		}
		for (int i = 0;i < m;i++) {
			int count = 1;
			for (int j = 2;j < n[i];j++) {
				if (n[i] % j == 0) {
					count+= j;
				}
			}
			//System.out.println(count);
			if (count > n[i]) {
				System.out.println(n[i] + " is an abundant number.");
			} else if (count == n[i]) {
				System.out.println(n[i] + " is a perfect number.");
			} else {
				System.out.println(n[i] + " is a deficient number.");
			}
		}
	}
}

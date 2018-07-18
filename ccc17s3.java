package problems;
import java.util.Scanner;
public class ccc17s3 {
	public static Scanner sc = new Scanner (System.in);
	public static int[] l = new int[2001];
	public static int finder(int height) { // implement Counted SorT
		int[] L2 = new int[l.length];
		for (int i = 0;i < l.length;i++) {
			L2[i] = l[i];
		}
		int a = Math.max(1, height - 2000);
		int b = height - a;
		int numB = 0;
		while (a <= (height / 2)) {
			if (a == b) {
				int B = L2[a] / 2;
				L2[a] -= numB * 2;
				numB += B;
				
			} else {
				int B = Math.min(L2[a], L2[b]);
				L2[a] -= B;
				L2[b] -= B;
				numB += B;
			}
			a++;
			b--;
		}
		return numB;
	}
	public static void main (String[] args) {
		int N = sc.nextInt();
		for (int i = 0;i < N;i++) {
			int L = sc.nextInt();
			l[L]++;
		}
		int maxB = 0;
		int heights = 0;
		for (int i = 2;i < 4000;i++) {
			int B = finder(i);
			if (B > maxB) {
				maxB = B;
				heights = 0;
			}
			if (B == maxB) {
				heights++;
			}
		}
		System.out.println(maxB + " " + heights);
	}
}

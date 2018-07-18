package problems;
import java.util.Scanner;
public final class ccc96s5 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int t = sc.nextInt();
		for (int i = 0;i < t;i++) {
			int curmax = 0;
			int m = sc.nextInt();
			int[] x = new int[m];
			int[] y = new int[m];
			for (int j = 0;j < m;j++) {
				x[j] = sc.nextInt();
			}
			for (int k = 0;k < m;k++) {
				y[k] = sc.nextInt();
			}
			int ans = 0;
			int mid = 0;
			for (int l = 0;l < m;l++) {
				int low = 0;
				int high = m - 1;
				while (low <= high) {
					mid = (low + high) / 2;
					if (y[mid] >= x[l]) {
						low = mid + 1;
					} else {
						high = mid - 1;
					}
				}
				ans = Math.max(curmax, mid - l);
				curmax = ans;
			}
			System.out.println("The maximum distance is " + ans);
		}
	}
}

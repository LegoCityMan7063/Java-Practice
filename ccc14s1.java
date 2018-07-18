package problems;
import java.io.*;
public class ccc14s1 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws IOException {
		int k = Integer.parseInt(in.readLine());
		int[] friends = new int[k + 1];
		for (int i = 1;i <= k;i++) {
			friends[i] = i;
		}
		int m = Integer.parseInt(in.readLine());
		for (int i = 0;i < m;i++) {
			int n = Integer.parseInt(in.readLine());
			int c = 0;
			for (int j = 1;j <= k;j++) {
				if (friends[j] != -1) {
					c++;
				}
				if (c % n == 0) {
					friends[j] = -1;
				}
			}
		}
		for (int i = 1;i < friends.length;i++) {
			if (friends[i] != -1) {
				System.out.println(friends[i]);
			}
		}
	}
}

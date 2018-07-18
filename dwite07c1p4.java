package problems;
import java.io.*;
import java.util.Arrays;
public class dwite07c1p4 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static int infinity = Integer.MAX_VALUE - 1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		int h = Integer.parseInt(in.readLine());
		int s = Integer.parseInt(in.readLine());
		int bHeight;
		int[] minB = new int[h+1];
		Arrays.fill(minB, infinity);
		minB[0] = 0;
		for (int i = 0;i < s;i++) {
			bHeight = Integer.parseInt(in.readLine());
			for (int j = h;j >= bHeight;j--) {
				minB[j] = Math.min(minB[j - bHeight] + 1, minB[j]);
			}
		}
		if (minB[h] != infinity) {
			System.out.println(minB[h]);
		} else {
			System.out.println(0);
		}
		
	}
}

package problems;
import java.io.*;
import java.util.StringTokenizer;
public class Art {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine());
		int[] l = new int[5];
		int c = 0;
		for (int i = 0;i < 5;i++) {
			l[i] = Integer.parseInt(st.nextToken());
		}
		for (int j = 0;j < 3;j++) {
			for (int k = 1;k < 4;k++) {
				for (int m = 2;m < 5;m++) {
					if (l[j] + l[k] >= l[m]) {
						c++;
					}
				}
			}
		}
		System.out.println(c);
	}
}

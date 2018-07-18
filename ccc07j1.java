package problems;

import java.io.*;
import java.util.Arrays;
public class ccc07j1 {
	public static BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws IOException {
		Integer[] in = new Integer[3];
		for (int i = 0;i < 3;i++) {
			String number = input.readLine();
			in[i] = Integer	.parseInt(number);
		}
		Arrays.sort(in);
		System.out.println(in[1]);
	}
}

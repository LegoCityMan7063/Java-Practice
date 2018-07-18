package problems;

import java.io.*;
import java.util.*;

public class IntelLUL {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws IOException {
		int N = Integer.parseInt(in.readLine());
		for (int i = 0;i < N;i++) {
			String input = in.readLine();
			StringTokenizer st = new StringTokenizer(input);
			long A = Long.parseLong(st.nextToken());
			long B = Long.parseLong(st.nextToken());
			long C = Long.parseLong(st.nextToken());
			if (A * B == C) {
				System.out.println("POSSIBLE DOUBLE SIGMA");
			} else {
				System.out.println("16 BIT S/W ONLY");
			}
		}
	}
}

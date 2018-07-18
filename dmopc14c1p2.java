package problems;

import java.util.*;
import java.io.*;

public class dmopc14c1p2 {
	public static BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer (in.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(in.readLine());
		w /= s;
		h /= s;
		System.out.println(w*h);
	}
}

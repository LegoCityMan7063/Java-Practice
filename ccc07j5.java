package problems;

import java.io.*;
import java.util.*;
public class ccc07j5 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static int A;
	public static int B;
	public static int N;
	public static int ways = 0;
	public static ArrayList<Integer> motels = new ArrayList<Integer>();
	public static void d(int stop) {
		if (stop == motels.size() - 1) {
			ways++;
			return;
		}
		for (int i = stop + 1;i < motels.size();i++) {
			int dis = motels.get(i) - motels.get(stop);
			if (dis >= A && dis <= B) {
				d(i);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());
		N = Integer.parseInt(in.readLine());
		int m[] = {0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};
		for (int i : m) motels.add(i); 
		for (int i = 0;i < N;i++) {
			int l = Integer.parseInt(in.readLine());
			motels.add(l);
		}
		Collections.sort(motels);
		d(0);
		System.out.println(ways);
	}
}

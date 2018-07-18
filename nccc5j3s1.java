package problems;
import java.util.*;
public class nccc5j3s1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int X = sc.nextInt();
		int in[] = new int[N];
		for (int i = 0;i < N;i++) {
			in[i] = sc.nextInt();
		}
		Arrays.sort(in);
		if (Arrays.binarySearch(in, X) >= 0) {
			
		}
	}
}

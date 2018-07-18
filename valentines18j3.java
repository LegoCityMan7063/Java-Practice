package problems;
import java.util.*;
public class valentines18j3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		String[] S = new String[N];
		int[] K = new int[N];
		int[] k = new int[N];
		for (int i = 0;i < N;i++) {
			S[i] = sc.next();
			K[i] = sc.nextInt();
			k[i] = K[i];
		}
		Arrays.sort(k);
		int median = k[(k.length + 1) / 2];
		//System.out.println(median);
		for (int i = 0;i < N;i++) {
			if (K[i] >= median) {
				System.out.println(S[i] + " is cute! <3");
			} else {
				System.out.println(S[i] + " is not cute. </3");
			}
		}
	}
}

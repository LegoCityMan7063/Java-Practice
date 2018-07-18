package problems;
import java.util.Scanner;
public class nccc5j2 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int N = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0;i < N;i++) {
			input[i] = sc.nextInt();
		}
		int[] count = new int[11];
		for (int i = 0; i < N;i++) {
			count[input[i]]++;
		}
		//System.out.println(count);
		int ans = count.length - 1;
		for (int i = count.length - 1;i >= 0;i--) {
			if (count[i] >= count[ans]) {
				ans = i;
			}
			//System.out.println(ans);
		}
		System.out.println(ans);
	}
}

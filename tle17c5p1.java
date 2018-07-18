package problems;
import java.util.*;
public class tle17c5p1 {
	public static Scanner sc = new Scanner(System.in);
	public static Random r = new Random();
	public static void main (String[] args) {
		int N = r.nextInt(50 - -50 + 1) + -50;
		//System.out.println(N);
		String input = " ";
		int n;
		while (!input.equals("answer")) {
			input = sc.next();
			n = sc.nextInt();
			if(input.equals("guess")) {
				System.out.println(Math.abs(N - n));
			}
			System.out.flush();
		}
	}
}

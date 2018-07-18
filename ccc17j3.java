package problems;
import java.util.*;
public class ccc17j3 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int t = sc.nextInt();
		int d2 = Math.abs(a - c) + Math.abs(b - d);
		if (d2 <= t && (t - d2) % 2 == 0) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
	}
}

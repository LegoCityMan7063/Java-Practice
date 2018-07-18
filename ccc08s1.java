package problems;
import java.util.Scanner;
public class ccc08s1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		String c = "";
		int t;
		int min = 201;
		String minc = "";
		while (!c.equals("Waterloo")) {
			c = sc.next();
			t = sc.nextInt();
			if (t < min) {
				minc = c;
				min = t;
			}
		}
		System.out.println(minc);
	}
}

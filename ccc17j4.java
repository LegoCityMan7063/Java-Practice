package problems;
import java.util.*;
public class ccc17j4 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int d2 = sc.nextInt();
		int h = 12;
		int m = 0;
		int count = 0;
		int a;
		int b;
		int c;
		int d;
		for (int i = 0;i < d2 % 720;i++) {
			m+=1;
			if (m >= 60) {
				m-=60;
				if (h + 1 < 13) {
					h+=1;
				} else {
					h = (h + 1) % 12;
				}
			}
			if (h / 10 == 0) {
				a = 0;
				b = h;
			} else {
				a = 1;
				b = h % 10;
			}
			if (m >= 10) {
				c = m / 10;
				d = m % 10;
			} else {
				c = 0;
				d = m;
			}
			if (a == 0) {
				if (b - c == c - d) {
					count++;
					//System.out.println("" + a + b + c + d);
				}
			} else if (a - b == b - c && b - c == c - d) {
				count++;
				//System.out.println("" + a + b + c + d);
			}
		}
		count += 31 * (d2 / 720);
		System.out.println(count);
	}
}

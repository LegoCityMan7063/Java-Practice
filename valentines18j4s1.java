package problems;
import java.util.*;
public class valentines18j4s1 {
	public static Scanner sc = new Scanner (System.in);
	public static boolean isPal(int integer) {
		String palindrome = String.valueOf(integer);
		return palindrome.equals(new StringBuilder(palindrome).reverse().toString());
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mean = (n + m) / 2;
		for (int i = 0;i < (m - mean);i++) {
			if (isPal(mean + i) && isPal(mean - i)) {
				System.out.println(mean + i);
			} else if (isPal(mean + i)) {
				System.out.println(mean + i);
			} else if (isPal(mean - i)) {
				System.out.println(mean - i);
			}
		}
	}
}

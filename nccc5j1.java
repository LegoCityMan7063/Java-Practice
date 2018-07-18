package problems;
import java.util.Scanner;
public class nccc5j1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		String input = sc.next();
		if (input.contains("CCC")) {
			System.out.println("NO");
		} else {
			System.out.print("YES");
		}
	}
}

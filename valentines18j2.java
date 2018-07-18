package problems;
import java.util.Scanner;
public class valentines18j2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int n = 1;
		int sum = X;
		while (sum < N) {
			X = X - Y;
			sum += X;
			//System.out.println(sum);
			n++;
			if (sum <= 0) {
				System.out.println("RIP");
				System.exit(0);
			}
		}
		if (sum >= N) {
			System.out.println(n);
		} else {
			System.out.println("RIP");
		}
	}
}

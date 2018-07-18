package problems;
import java.util.Scanner;
public class valentines18j1 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		int K[] = new int[N];
		for (int i = 0;i < N;i++) {
			K[i] = sc.nextInt();
		}
		for (int i = 0;i < N;i++) {
			if (K[i] > 10000) {
				System.out.println("Something is wrong with these cuteness values");
				System.exit(0);
			} else if (K[i] <= 10000 && K[i] > 1000) {
				System.out.println("Cuteness by definition is similarity to Cactus");
				System.exit(0);
			}
		}
		System.out.println("Cuteness by definition is similarity to Carol");
	}
}

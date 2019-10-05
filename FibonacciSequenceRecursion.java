package examples;
import java.io.*;
public class FibonacciSequenceRecursion {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static int fibonacci(int a) {
		if (a == 0) {
			return 0;
		} else if (a == 1) {
			return 1;
		} else {
			return fibonacci(a - 1) + fibonacci(a - 2);
		}
	}
	public static void main (String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		System.out.println(fibonacci(n));
	}
}

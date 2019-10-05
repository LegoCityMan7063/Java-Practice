package examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FibonacciSequenceDynamic {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static int fibonacci(int a) {
		int[] f = new int[a+1];
		f[1] = 1;
		f[2] = f[1];
		for (int i = 3;i <= a;i++) {
			f[i] = f[i-1] % 1000000007 + f[i-2] % 1000000007;
		}
		return f[a] % 1000000007;
	}
	public static void main (String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		System.out.println(fibonacci(n));
	}
}

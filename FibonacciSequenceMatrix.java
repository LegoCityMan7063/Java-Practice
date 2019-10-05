package examples;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FibonacciSequenceMatrix {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static long fibonacci(long n) {
		long f[][] = new long[][] {
			{1,1},
			{1,0}
		};
		if (n == 0) {
			return 0;
		} 
		power(f, n - 1);
		return f[0][0];	
	}
	public static void power(long f[][], long n) {
		long g[][] = new long[][] {
			{1, 1},
			{1, 0}
		};
		if (n == 0 || n == 1) {
			return;
		}
		power(f, n / 2);
		multiply(f, f);
		if (n % 2 != 0) {
			multiply(f, g);
		}
	}
	public static void multiply(long f[][], long g[][]) {
		long w = f[0][0] * g[0][0] + f[0][1] * g[1][0];
		long x = f[0][0] * g[0][1] + f[0][1] * g[1][1];
		long y = f[1][0] * g[0][0] + f[1][1] * g[1][0];
		long z = f[1][0] * g[0][1] + f[1][1] * g[1][1];
		f[0][0] = w % 1000000007;
		f[0][1] = x % 1000000007;
		f[1][0] = y % 1000000007;
		f[1][1] = z % 1000000007;
	}
	public static void main (String[] args) throws IOException {
		long n = Long.parseLong(in.readLine());
		System.out.println(fibonacci(n));
	}
}

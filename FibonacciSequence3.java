package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSequence3 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static long fibonacci(long n) {
		long a = 1;
		long b = 1;
		for (long i = 3;i <= n;i++) {
			long c = a % 1000000007 + b % 1000000007;
			a = b;
			b = c;
		}
		return b % 1000000007;		
	}
	public static void main (String[] args) throws IOException {
		long n = Long.parseLong(in.readLine());
		System.out.println(fibonacci(n));
	}
}

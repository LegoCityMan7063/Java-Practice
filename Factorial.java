package examples;
import java.math.*;
import java.io.*;
public class Factorial {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		int N = Integer.parseInt(in.readLine());
		long n;
		for (int i = 0;i < N;i++) {
			BigInteger ans = BigInteger.valueOf(1);
			n = Long.parseLong(in.readLine());
			for (long j = 2;j <= n;j++) {
				ans = ans.multiply(BigInteger.valueOf(j));
			}
			System.out.println(ans);
		}
	}
}

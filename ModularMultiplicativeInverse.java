package examples;
import java.io.*;
import java.util.*;
import java.math.*;
public class ModularMultiplicativeInverse {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine());
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger(st.nextToken());
		System.out.println(N.modInverse(M));
	}
}

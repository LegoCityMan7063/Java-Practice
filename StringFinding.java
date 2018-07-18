package problems;

import java.io.*;

public class StringFinding {
	public static BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
	public static void main (String[] args) throws IOException {
		String a = input.readLine();
		String b = input.readLine();
		System.out.println(a.indexOf(b));
	} 
}

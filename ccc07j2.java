package problems;

import java.io.*;

public class ccc07j2 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		String tokens = " ";
		while (true) {
			tokens = in.readLine();
			if (tokens.equals("CU")) {
				System.out.println("see you");
			} else if (tokens.equals(":-)")) {
				System.out.println("I'm happy");
			} else if (tokens.equals(":-(")) {
				System.out.println("I'm unhappy");
			} else if (tokens.equals(";-)")) {
				System.out.println("wink");
			} else if (tokens.equals(":-P")) {
				System.out.println("stick out my tongue");
			} else if (tokens.equals("(~.~)")) {
				System.out.println("sleepy");
			} else if (tokens.equals("TA")) {
				System.out.println("totally awesome");
			} else if (tokens.equals("CCC")) {
				System.out.println("Canadian Computing Competition");
			} else if (tokens.equals("CUZ")) {
				System.out.println("because");
			} else if (tokens.equals("TY")) {
				System.out.println("thank-you");
			} else if (tokens.equals("YW")) {
				System.out.println("you're welcome");
			} else if (tokens.equals("TTYL")) {
				System.out.println("talk to you later");
				System.exit(0);
			} else {
				System.out.println(tokens);
			}
		}
	}
}

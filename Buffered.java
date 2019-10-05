package examples;

import java.io.*;

public class Buffered {
	
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main (String[] args) throws IOException {
		String[] tokens = in.readLine().split(" ");
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[1]);
		
	}
}

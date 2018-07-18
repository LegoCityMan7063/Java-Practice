package problems;
import java.io.*;
public class GermanNouns {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String[] args) throws IOException {
		int N = Integer.parseInt(in.readLine());
		String s;
		int c;
		for (int i = 0;i < N;i++) {
			c = 0;
			s = in.readLine();
			if (Character.isUpperCase(s.charAt(0))) {
				c++;
			}
			for (int j = 0;j < s.length() - 1;j++) {
				if (s.charAt(j) == ' ' ) {
					if (Character.isUpperCase(s.charAt(j + 1))) {
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}
}

package problems;
import java.io.*;
public class MockingSpongebob {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		String[] input = new String[n];
		for (int i = 0;i < n;i++) {
			input[i] = in.readLine();
		}
		for (int i = 0;i < n;i++) {
			StringBuilder builder = new StringBuilder();
			int counter = 0;
			for (int j = 0;j < input[i].length();j++) {
				if (Character.isLetter(input[i].charAt(j))) {
					if (counter % 2 == 0) {
						builder.append(input[i].substring(j,j+1).toLowerCase());
					} else {
						builder.append(input[i].substring(j,j+1).toUpperCase());
					}
					counter++;
				} else {
					builder.append(input[i].substring(j,j+1));
				}
			}
			String result = builder.toString();
			System.out.println(result);
		}
	}
}

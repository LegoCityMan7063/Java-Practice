package problems;
import java.io.*;
public class dwite07c1p2 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		double l = Double.parseDouble(in.readLine());
		double h = Double.parseDouble(in.readLine());
		double result = (l * l * h) / 3;
		System.out.println((int) (Math.ceil(result)));
	}
}

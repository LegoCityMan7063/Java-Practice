package problems;

import java.io.*;

public class ccc08j1 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
	public static void main (String[] args) throws NumberFormatException, IOException {
		double w = Double.parseDouble(in.readLine());
		double h = Double.parseDouble(in.readLine());
		double bmi = w / (h * h);
		if (bmi > 25) {
			System.out.println("Overweight");
		} else if (bmi <= 25 && bmi >= 18.5) {
			System.out.println("Normal weight");
		} else {
			System.out.println("Underweight");
		}
	}
}

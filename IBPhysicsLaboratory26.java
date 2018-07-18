package problems;

import java.awt.*;
import java.util.Scanner;
public class IBPhysicsLaboratory26 {
	public static Scanner sc = new Scanner(System.in);
	public static final int M = 20; //icosahedron
	public static void main(String[] args) {
		int N;
		int j = 0;
		int selected_number = (int) Math.round((M - (double) 1 / (double) 2) * Math.random()) + 1;
		System.out.print("Enter N: ");
		N = sc.nextInt();
		for(int i = 0;i <= N - 1;i++) {
			if ((int) Math.round((M - (double) 1/(double) 2) * Math.random()) + 1 == selected_number) {
				j++;
			}
		}
		N -= j;
		System.out.println("N = " + N);
	} // main method
} // RadioactiveDecay class

package problems;

import java.util.Scanner;

public class dwite08c2p1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		String[] input = new String[7];
		int[] output = new int[5];
		int counter = 0;
		String counter2 = "";
	
		for (int i = 0; i < 5;i++) {
			for (int j = 0 ;j < 7;j++) {
				input[j] = sc.nextLine();
			}
			
			System.out.println();
		}
		
		for (int b = 0; b < 5;b++) {
			for (int k = 0;k < 7;k++) {
				for(int l = 0;l < 5;l++) {
					counter = 0;
					if (input[l].charAt(l) == '#') {
						counter++;
					}
				}
				counter2 = counter2.concat(String.valueOf(counter));
			}
			
			output[b] = Integer.parseInt(counter2);
		}
		
		for (int m = 0;m < 5;m++) {
			System.out.println(output[m]);
		}
	}
}

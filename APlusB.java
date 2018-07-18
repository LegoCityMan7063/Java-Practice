package problems;

import java.util.Scanner;

public class APlusB {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int[] numbers =  new int[n*2];
		
		for (int i = 0; i < n*2;i++) {
							
				numbers[i] = sc.nextInt(); 
				
			
		}
		
		for (int j = 0; j < n*2;j+=2) {
				
				System.out.println(numbers[j+1] + numbers[j]);
		
			
		}
		
		sc.close();
	}
}

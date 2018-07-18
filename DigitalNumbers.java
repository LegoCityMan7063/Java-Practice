package problems;

import java.util.Scanner;

public class DigitalNumbers {
	
	
	public static void display (int number) {		
		
		
		if (number == 0) {
			
			System.out.println(" * * * ");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * * ");
			
		} else if (number == 1) {
			
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("");
			System.out.println("    *");
			System.out.println("    *");
			System.out.println("    *");
			
		} else if (number == 3) {
			
			System.out.println(" * * *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println(" * * *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println(" * * *");
			
		} else if (number == 4) {
			
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("      *");
			
		} else if (number == 5) {
			
			System.out.println(" * * *");
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
			System.out.println(" * * *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println(" * * *");
			
		} else if (number == 6) {
			
			System.out.println(" * * *");
			System.out.println("*");
			System.out.println("*");
			System.out.println("*");
			System.out.println(" * * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * *");
			
		} else if (number == 7) {
			
			System.out.println(" * * *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("      *");
			
		} else if (number == 8) {
			
			System.out.println(" * * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * *");
			
			
			
		} else if (number == 9) {
			
			System.out.println(" * * *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println("*     *");
			System.out.println(" * * *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println("      *");
			System.out.println(" * * *");
			
		}
	}
		
	
		
		
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();
		display(number);


		sc.close();
		
	}
}

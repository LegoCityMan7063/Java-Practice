package problems;

import java.util.*;

public class ListMinimum {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n;i++) {
			
			int input = sc.nextInt();
			list.add(input);
		}
		
		Collections.sort(list);
		
		for (int j = 0;j < n;j++) {
			
			System.out.println(list.get(0));
	
			list.remove(0);
			
		}
		
		sc.close();
	}
}

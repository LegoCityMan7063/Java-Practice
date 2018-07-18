package problems;
import java.util.*;
public class BubbleSort {
	public static Scanner sc = new Scanner (System.in);
	public static void bubble(int[] n) {
		int temp;
		for (int k = 0;k < n.length;k++) {
			System.out.print(n[k] + " ");
		}
		System.out.println();
		for (int i = 0;i < n.length;i++) {
			for (int j = 1;j < (n.length - i);j++) {
				if (n[j-1] > n[j]) {
					temp = n[j-1];
					n[j-1] = n[j];
					n[j] = temp;
					for (int k = 0;k < n.length;k++) {
						System.out.print(n[k] + " ");
					}
					System.out.println();
				}
			}
		}
	}
	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] n = new int[N]; 
		for (int i = 0;i < N;i++) {
			n[i] = sc.nextInt();
		}
		bubble(n);
	}
}

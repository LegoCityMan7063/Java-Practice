package examples;

import java.util.Scanner;

public class DFS3 {
	
	public static int M;
	public static int N;
	public static int[][] matrix;
	public static boolean[] visited;
	
	public static void dfs(int cur) {
		
		visited[cur] = true;
		
		for (int i = 0;i < N;i++) {
			if (matrix[cur][i] > 0 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		for (int i = 0; i < M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			matrix[a][b] = 1;
			matrix[b][a] = 1;
			
			dfs(0);
			
			if (visited[N-1]) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}

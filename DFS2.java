package examples;

import java.util.Scanner;

public class DFS2 {
	
	public static int M = 0;
	public static int N = 4;
	public static int[][] matrix;
	public static boolean[] visited;
	
	public static void dfs(int cur) {
		
		visited[cur] = true;
		
		for (int i = 0;i < N;i++) {
			if (matrix[cur][i] == 1 & !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		matrix = new int[N][N];
		visited = new boolean[N];
		
		for (int i = 0;i <  N;i++) {
			for (int j = 0;j < N;j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] == 1) {
					M++;
				}
			}
		}
		
		M = M / 2;
		dfs(0);
		
		boolean allvisited = true;
		
		for (int i = 0;i < N;i++) {
			if (!visited[i]) {
				allvisited = false;
			} 
			
			if (N == M + 1 && allvisited) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}
}

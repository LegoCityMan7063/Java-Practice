package problems;

import java.util.Scanner;

public class ccc01s3 {
	
	public static boolean[][]  matrix;
	public static boolean[] visited;
	
	
	public static void dfs (int cur) {
		visited[cur] = true;
		for (int i = 0; i < 26;i++) {
			if ((matrix[i][cur] || matrix[cur][i]) && !visited[i])
				dfs(i);
		}
	}
	
	public static boolean test() {
		visited = new boolean[26];
		dfs(0);
		return visited[1];
	}
	
	
	public static void main (String[] args) {	
		Scanner sc = new Scanner (System.in);
		
		matrix = new boolean[26][26];
		 while (true) {
			 String str = sc.next();
			 if (str.equals("**")) break;
			 int a  = str.charAt(0) - 'A';
			 int b = str.charAt(1) - 'A';
			 matrix[a][b] = true;			 
		 }
		 
		 int cnt = 0;
		 for (int i=0;i<26;i++) {
			 for (int j=0;j< 26;j++) {
				 if (matrix[i][j]) {
					 matrix[i][j] = false;
					 if (!test() ) {
						 System.out.println(String.format("%c%c", i + 'A', j + 'A'));
						 cnt++;
					 }
					 matrix[i][j] = true;
				 }
			 }
		 }
		 
		 System.out.printf("There are %d disconnecting roads.\n", cnt);
		 
		sc.close();
	}
}

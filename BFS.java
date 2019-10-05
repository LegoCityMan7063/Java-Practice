package examples;
import java.util.*;
public class BFS {
	public static int N;
	public static int M;
	public static boolean[][] matrix;
	public static boolean[] visited;
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		matrix = new boolean[N][N];
		visited = new boolean[N];
		for (int i = 0;i < M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			matrix[a][b] = true;
			matrix[b][a] = true;
		}
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(0);
		while(!q.isEmpty()) {
			int cur = q.poll();
			visited[cur] = true;
			System.out.println(cur);
			for (int i = 0;i < N;i++) {
				if (matrix [cur][i] && !visited[i]) {
					q.offer(i);
				}
			}
		}
	}
}

package examples;
import java.util.*;
// pick any node and traverse graph from said node
// after check if every node has been visited at least once
public class BFSProblem1 {
	public static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		boolean matrix[][] = new boolean[N][N];
		boolean visited[] = new boolean[N];
		for (int i = 0;i < M;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			matrix[a][b] = true;
			matrix[b][a] = true;
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(A);
		while(!q.isEmpty()) {
			int cur = q.poll();
			if (visited[cur]) {
				continue;
			}
			visited[cur] = true;
			for (int i = 0;i < N;i++) {
				if (matrix[cur][i] && !visited[i]) {
					q.add(i);
				}
			}
		}
		if (visited[B]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

package examples;

public class ConnectFour {
	public static int checkForWinner(int[][] board) {
		// Vertical Win
		for (int r = 0; r <= board.length - 4;r++) {
			for (int c = 0; c < board[0].length;c++) {
				if (board[r][c] != 0 && board[r][c] == board[r+1][c] && board[r+1][c] == board[r+2][c] && board[r+2][c] == board[r+3][c]) {
					return board[r][c];
				}
			}
		}
		// Diagonal Downward Win
		for (int r = 0; r <= board.length - 4;r++) {
			for (int c = 0; c <= board[0].length;c++) {
				if (board[r][c] != 0 && board[r][c] == board[r+1][c+1] && board[r+1][c+1] == board[r+2][c+2] && board[r+2][c+2] == board[r+3][c+3]) {
					return board[r][c];
				}
			}
		}
		// Horizontal Win
		for (int r = 0;r <= board.length;r++) {
			for (int c = 0;c <= board[0].length;c++) {
				if (board[r][c] != 0 && board[r][c] == board[r][c+1] && board[r][c+1] == board[r][c+2] && board[r][c+2] == board[r][c+3]) {
					return board[r][c];
				}
			}
		}
		// Diagonal Upward Win
		for (int r = 0;r <= board.length;r++) {
			for (int c = 0;c <= board[0].length;c++) {
				if (board[r][c] != 0 && board[r][c] == board[r-1][c+1] && board[r-1][c+1] == board[r-2][c+2] && board[r-2][c+2] == board[r-3][c+3]) {
					return board[r][c];
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0}
		};
		System.out.println("Winner: " + checkForWinner(board));
	}
}

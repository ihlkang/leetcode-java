package HashTable;

/*
 * 37Ã‚
 */
public class Sudoku_Solver {

	public void solveSudoku(char[][] board) {
		if (board == null || board.length == 0) {
			return;
		}
		solve(board);
		for (int i = 0; i < board.length; i++) {
			System.out.println("" + board[i][0] + " " + board[i][1] + " " + board[i][2] + " " + board[i][3] + " "
					+ board[i][4] + " " + board[i][5] + " " + board[i][6] + " " + board[i][7] + " " + board[i][8]);
			System.out.println('\n');
		}
	}

	private boolean solve(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.') {
					for (char c = '1'; c <= '9'; c++) {
						if (isValid(board, i, j, c)) {
							board[i][j] = c;
							if (solve(board))
								return true;
							else
								board[i][j] = '.';
						}
					}
					return false;
				}
			}
		}
		return true;

	}

	private boolean isValid(char[][] board, int row, int col, char c) {
		for (int k = 0; k < 9; k++) {
			if (board[row][k] != '.' && board[row][k] == c)
				return false;
			if (board[k][col] != '.' && board[k][col] == c)
				return false;
			if (board[3 * (row / 3) + k / 3][3 * (col / 3) + k % 3] != '.'
					&& board[3 * (row / 3) + k / 3][3 * (col / 3) + k % 3] == c)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		Sudoku_Solver ss = new Sudoku_Solver();
		ss.solveSudoku(board);
	}
}

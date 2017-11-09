package HashTable;

import java.util.HashSet;

/* 36Ã‚
 * The Sudoku board could be partially filled, 
 * where empty cells are filled with the character '.'.
 */
public class Valid_Sudoku {
	
	public boolean isValidSudoku(char[][] board) {
		for(int i=0;i<9;i++){
			HashSet<Character> rows=new HashSet<Character>();
			HashSet<Character> cols=new HashSet<Character>();
			HashSet<Character> cutes=new HashSet<Character>();
			for(int j=0;j<9;j++){
				if(board[i][j]!='.' && !rows.add(board[i][j]))
					return false;
				if(board[j][i]!='.' && !cols.add(board[j][i]))
					return false;
				int rowIndex=3*(i/3);
				int colIndex=3*(i%3);
				if(board[rowIndex+j/3][colIndex+j%3]!='.' && 
						!cutes.add(board[rowIndex+j/3][colIndex+j%3]))
					return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		char[][] board={{'.','8','7','6','5','4','3','2','1'},
						{'2','.','.','.','.','.','.','.','.'},
						{'3','.','.','.','.','.','.','.','.'},
						{'4','.','.','.','.','.','.','.','.'},
						{'5','.','.','.','.','.','.','.','.'},
						{'6','.','.','.','.','.','.','.','.'},
						{'7','.','.','.','.','.','.','.','.'},
						{'8','.','.','.','.','.','.','.','.'},
						{'9','.','.','.','.','.','.','.','.'}};
		
		Valid_Sudoku vsd=new Valid_Sudoku();
		System.out.println(vsd.isValidSudoku(board));
	}

	}



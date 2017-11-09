package Backtracking;

import java.util.ArrayList;
import java.util.List;

/* 52
 * N»ÊºóÎÊÌâII
 * 
 */
public class N_QueensII {
	int count=0;
	public int totalNQueens(int n) {
		char[][] chars=new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				chars[i][j]='.';
			}
		solve(chars,0);
		return count;
	
	}
	private void solve(char[][] chars,int colIndex){
		if(colIndex==chars.length){
			count++;
			return;
		}
		for(int rowIndex=0;rowIndex<chars.length;rowIndex++){
			if(isright(chars, rowIndex, colIndex)){
				chars[rowIndex][colIndex]='Q';
				solve(chars,colIndex+1);
				chars[rowIndex][colIndex]='.';
			}
		}
	}
	private boolean isright(char[][] chars,int rowIndex,int colIndex){
		for(int row=0;row<chars.length;row++){
			for(int col=0;col<colIndex;col++){
				if(chars[row][col]=='Q' && (row+col==rowIndex+colIndex || 
						row+colIndex==col+rowIndex || row==rowIndex)){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		N_QueensII nqueens=new N_QueensII();
		nqueens.totalNQueens(4);
	}
}

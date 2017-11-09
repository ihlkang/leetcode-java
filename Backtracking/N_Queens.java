package Backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * 51 N»ÊºóÎÊÌâ
 */
public class N_Queens {
	
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> res=new ArrayList<List<String>>();
		char[][] chars=new char[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				chars[i][j]='.';
			}
		solve(chars,0,res);
		return res;
	}
	private void solve(char[][] chars,int colIndex,List<List<String>> res){
		if(colIndex==chars.length){
			List<String> list=new ArrayList<>();
			for(int i=0;i<chars.length;i++){
				list.add(new String(chars[i]));
			}
			res.add(list);
			return;
		}
		for(int rowIndex=0;rowIndex<chars.length;rowIndex++){
			if(isright(chars, rowIndex, colIndex)){
				chars[rowIndex][colIndex]='Q';
				solve(chars,colIndex+1,res);
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
		N_Queens nqueens=new N_Queens();
		nqueens.solveNQueens(4);
	}
}

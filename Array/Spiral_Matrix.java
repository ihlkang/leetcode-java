package Array;

import java.util.ArrayList;
import java.util.List;

/*
 * 54Ìâ
 * Spiral Matrix
 * ÂÝÐýË³Ðò·µ»Ø
 * [[ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]]
 *  You should return [1,2,3,6,9,8,7,4,5].
 */
public class Spiral_Matrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
		
		List<Integer> list=new ArrayList<Integer>();
		if(matrix.length==0){
			return list;
		}
		int rowbegin=0;
		int rowend=matrix.length-1;
		int colbegin=0;
		int colend=matrix[0].length-1;
		while(rowbegin<=rowend && colbegin<=colend){
			for(int i=colbegin;i<=colend;i++){
				list.add(matrix[rowbegin][i]);
			}
			rowbegin++;
			for(int i=rowbegin;i<=rowend;i++){
				list.add(matrix[i][colend]);
			}
			colend--;
			if(rowbegin<=rowend){
				for(int i=colend;i>=colbegin;i--){
					list.add(matrix[rowend][i]);
				}
			}
			rowend--;
			if(colbegin<=colend){
				for(int i=rowend;i>=rowbegin;i--){
					list.add(matrix[i][colbegin]);
				}
			}
			colbegin++;
		}
		return list;
	}
	public static void main(String[] args) {
		int[][] matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		Spiral_Matrix sm=new Spiral_Matrix();
		sm.spiralOrder(matrix);
	}

}

package Array;

/* 59Ã‚
 * Spiral Matrix II
 * [
 * [ 1, 2, 3 ]
 * [ 8, 9, 4 ]
 * [ 7, 6, 5 ]
 * ]
 */
public class Spiral_MatrixII {

	public int[][] generateMatrix(int n) {
		int[][] result=new int[n][n];
		int num=n*n;
		int k=1;
		int rowbegin=0,rowend=n-1,colbegin=0,colend=n-1;
		while(rowbegin<=rowend && colbegin<=colend){
			for(int col=colbegin;col<=colend;col++){
				result[rowbegin][col]=k++;
			}
			rowbegin++;
			for(int row=rowbegin;row<=rowend;row++){
				result[row][colend]=k++;
			}
			colend--;
			for(int col=colend;col>=colbegin;col--){
				result[rowend][col]=k++;
			}
			rowend--;
			for(int row=rowend;row>=rowbegin;row--){
				result[row][colbegin]=k++;
			}
			colbegin++;
		}
		return result;
	}

	public static void main(String[] args) {
		Spiral_MatrixII sm=new Spiral_MatrixII();
		sm.generateMatrix(3);
	}

}

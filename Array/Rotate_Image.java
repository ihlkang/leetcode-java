package Array;

/*
 * 48Ìâ.
 * You are given an n x n 2D matrix representing an image.
 */
public class Rotate_Image {
	
	public void rotate(int[][] matrix) {
		int n=matrix.length;
		int [][]result=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				result[j][n-1-i]=matrix[i][j];
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=result[i][j];
			}
		}
	}
	public static void main(String[] args) {
		int [][]result=new int[][]{{2,29,20,26,16,28},{12,27,9,25,13,21},{32,33,32,2,28,14},
			{13,14,32,27,22,26},{33,1,20,7,21,7},{4,24,1,6,32,34}};
		Rotate_Image ri=new Rotate_Image();
		ri.rotate(result);
	}

}

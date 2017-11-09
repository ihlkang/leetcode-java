package Array;
/*
 * 74Ã‚
 */
public class Search_2D_Matrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length==0 || matrix[0].length==0){
			return false;
		}
		int row=matrix.length;
		int col=matrix[0].length;
		int pre_row=0,curr_row=0;
		int pre_col=0,curr_col=0;
		
		while(curr_row<row && matrix[curr_row][0]<=target){
			pre_row=curr_row;
			curr_row++;
		}
		while(curr_col<col && matrix[pre_row][curr_col]<target){
			pre_col=curr_col;
			curr_col++;
		}
		if(matrix[pre_row][pre_col]==target){
			return true;
		}else{
			return false;
		}
		
	}
	public boolean searchMatrix2(int[][] matrix, int target) {
		if(matrix.length==0 || matrix[0].length==0){
			return false;
		}
		int mid=0;
		int row=matrix.length;
		int col=matrix[0].length;
		int l=0,r=row*col-1;
		while(l<=r){
			mid=(l+r-1)/2;
			if(matrix[mid/col][mid%col]<target){
				l=mid+1;
			}else{
				r=mid;
			}
		}
		return matrix[mid/col][mid%col]==target;
	}
	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 3, 5, 7 }, { 10,11,16,20 }, { 23, 30, 34, 50 }};
		Search_2D_Matrix s2m = new Search_2D_Matrix();
		s2m.searchMatrix(matrix, 15);
	}

}

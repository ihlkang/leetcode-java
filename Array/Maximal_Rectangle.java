package Array;
/*
 * 85Ã‚
 */
import java.util.Stack;

public class Maximal_Rectangle {

	public int maximalRectangle(char[][] matrix) {
		
		if(matrix==null || matrix.length==0 || matrix[0].length==0){
			return 0;
		}
		int length=matrix[0].length;
		int width=matrix.length;
		int[] height=new int[length+1];
		int max=0;
		height[length]=0;
		for(int i=0;i<width;i++){
			Stack<Integer> stack=new Stack<>();
			
			for(int j=0;j<length+1;j++){
				
				if(j<length){
					if(matrix[i][j]=='1'){
						height[j]+=1;
					}else{
						height[j]=0;
					}
				}	
				if(stack.isEmpty() || height[stack.peek()]<=height[j]){
					stack.push(j);
				}else{
					while(!stack.isEmpty() && height[j]<height[stack.peek()]){
						int top=stack.pop();
						int area=height[top]*(stack.isEmpty()?j:(j-1-stack.peek()));
						max=Math.max(max, area);
					}
					stack.push(j);
				}
			}
		
		}
		return max;
	}

	public static void main(String[] args) {
		char[][] matrix=new char[][]{{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
		Maximal_Rectangle mr=new Maximal_Rectangle();
		mr.maximalRectangle(matrix);
	}

}

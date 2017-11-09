package Array;
/*
 * 84Ã‚
 */
import java.util.Stack;

public class Largest_Rectangle_Histogram {

	public int largestRectangleArea(int[] heights) {
		
		int k=0,MaxResult=0;
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<=heights.length;i++){
			int h=(i==heights.length ?0:heights[i]);
			if(stack.isEmpty() || h>=heights[stack.peek()]){
				stack.push(i);
			}else{
				k=stack.pop();
				MaxResult=Math.max(MaxResult, heights[k]*(stack.isEmpty()?i:i-1-stack.peek()));
				i--;
			}
		}
		return MaxResult;
	}
	
	public static void main(String[] args) {
		Largest_Rectangle_Histogram lrh=new Largest_Rectangle_Histogram();
		lrh.largestRectangleArea(new int[]{2,1,5,6,2,3});
	}
	
}

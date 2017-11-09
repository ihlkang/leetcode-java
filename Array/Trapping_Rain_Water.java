package Array;

/* 42Ã‚
 * For example
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class Trapping_Rain_Water {
	
	public int trap(int[] height) {
		int result=0,left=0,right=height.length-1;
		int maxleft=0,maxright=0;
		while(left<=right){
			if(height[left]<=height[right]){
				if(height[left]>=maxleft)
					maxleft=height[left];
				else{
					result+=maxleft-height[left];
				}
				left++;
			}else{
				if(height[right]>=maxright)
					maxright=height[right];
				else{
					result+=maxright-height[right];
				}
				right--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
		Trapping_Rain_Water trw=new Trapping_Rain_Water();
		System.out.println(trw.trap(height));
	}

}

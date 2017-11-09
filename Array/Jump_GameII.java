package Array;

/* 45Ìâ
 * 2 3 1 1 4
 * Á½²½ :0->1,1->4 
 */
public class Jump_GameII {

	public int jump(int[] nums) {
		int length=nums.length,i=0,cnt=0,currMax=0,nextMax=0;
		if(length<2){
			return 0;
		}
		while(currMax-i+1>0){
			cnt++;
			while(i<=currMax){
				nextMax=Math.max(nextMax, nums[i]+i);
				if(nextMax>=length-1)
					return cnt;
				i++;
			}
			currMax=nextMax;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		int[] nums={2,3,1,1,4};
		Jump_GameII jg2=new Jump_GameII();
		jg2.jump(nums);
	}

}

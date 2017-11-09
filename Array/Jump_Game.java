package Array;

/*
 * 55Ìâ
 */
public class Jump_Game {

	public boolean canJump(int[] nums) {
        int i=0,nextMax=0,currMax=0,length=nums.length;
        while(currMax-i+1>0){
        	
        	while(i<=currMax){
        		
        		nextMax=Math.max(nums[i]+i,nextMax);
        		if(nextMax>=length-1){
        			return true;
        		}
        		i++;
        		
        	}
        	currMax=nextMax;
        	
        }
        return false;
	}
	public static void main(String[] args) {
		int[] nums={2,3,1,1,4};
		Jump_Game jg=new Jump_Game();
		jg.canJump(nums);
	}

}

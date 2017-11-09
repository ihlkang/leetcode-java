package Array;

/*
 * 75 Ã‚
 */
public class Sort_Colors {
	
	public void sortColors(int[] nums) {
		int red=0,white=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				red++;
			}else if(nums[i]==1){
				white++;
			}
		}
		for(int i=0;i<nums.length;i++){
			if(i<red){
				nums[i]=0;
			}
			if(i>=red && i<red+white){
				nums[i]=1;
			}
			if(i>=red+white){
				nums[i]=2;
			}
		}
	}

	public static void main(String[] args) {
		
	}

}

package Array;
/* 41题目
 * For example
 * Given [1,2,0] return 3
 * and [3,4,-1,1] return 2
 */
//找到第一个缺失的正数
public class First_Missing_Positive {
	
	public int firstMissingPositive(int[] nums) {
	     int len=nums.length;
	     int q=-1,temp=0;
	     if(len==0)
	    	 return 1;
	     for(int i=0;i<len;i++){
	    	 if(nums[i]>0){//q只有在nums[i]值大于0才自加,也就是说q停留在nums[i]值小于0的位置
	    		 q++;
	    		 swap(nums,q,i);//将当前的正数nums[i]与负数nums[q]交换
	    	 }
	     }
	     for(int j=0;j<q+1;j++){
	    	 temp=Math.abs(nums[j]);
	    	 if(temp<=q+1)
	    		 nums[temp-1]=(nums[temp-1]<0)?nums[temp-1]:-nums[temp-1];
	     }
	     for(int x=0;x<len;x++){
	    	 if(nums[x]>0)
	    		 return x+1;
	     }
	     return q+2; 
	}
	//方法二
	public int firstMissingPositiveII(int[] nums) {
		
		for(int i=0;i<nums.length;i++){
			//注意while()作用，只要当前位置的值不是小于0，大于n和正确的数会一直循环
			while(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1]){
				swap(nums,i,nums[i]-1);
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=i+1){
				return i+1;
			}
		}
		return nums.length;
	}
	private void swap(int[] nums,int i, int j) {
		if(i!=j){
			int temp;
			temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
		}
	}
	public static void main(String[] args) {
		int[] nums={3,4,-1,1};
		First_Missing_Positive fmp=new First_Missing_Positive();
		@SuppressWarnings("unused")//注解，suppressWarning，忽略没使用警告
		int result=fmp.firstMissingPositive(nums);
	}
}
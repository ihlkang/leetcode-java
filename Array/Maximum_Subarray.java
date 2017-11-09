package Array;

import java.util.Arrays;

/*
 * 53 Ìâ
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], 
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
    	int soFarMax=nums[0],sumMax=nums[0];
    	if(nums.length==1)
    		return nums[0];
    	for(int i=1;i<nums.length;i++){
    		sumMax=Math.max(sumMax+nums[i],nums[i]);
    		soFarMax=Math.max(sumMax, soFarMax);
    	}
    	return soFarMax;
	}
	public static void main(String[] args) {
		int[] nums=new int[]{-2,1,-3,4,-1,2,1,-5,4};
		Maximum_Subarray ms=new Maximum_Subarray();
		ms.maxSubArray(nums);
	}

}

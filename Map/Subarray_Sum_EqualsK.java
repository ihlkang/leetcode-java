package Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_EqualsK {
	/*
	 * sum[i,j]==k
	 * sum[0,j]-sum[0,i-1]==k
	 */
	public int subarraySum(int[] nums, int k) {
		int count=0;
		int sum=0;
		int flag=0,start=0;
		Map<Integer,Integer> map=new HashMap<>();
		while(start<nums.length){
			sum+=nums[start++];
			if(map.containsKey(sum-k)){
				count+=map.get(sum-k);
			}
			map.put(sum,map.getOrDefault(sum, 0)+1);
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums=new int[]{1,2,2,3,4};
		Subarray_Sum_EqualsK ssek=new Subarray_Sum_EqualsK();
		ssek.subarraySum(nums, 4);
	}
// added to test pull request
}

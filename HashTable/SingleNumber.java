package HashTable;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		int ans=0;
		int len=nums.length;
		for(int i=0;i!=len;i++){
			ans^=nums[i];
		}
		return ans;
		
	}

	public static void main(String[] args) {
		int[] nums=new int[]{1,2,3,3,2};
		SingleNumber sn=new SingleNumber();
		sn.singleNumber(nums);
	}

}

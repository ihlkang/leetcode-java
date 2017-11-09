package Array;

import java.util.HashMap;
import java.util.Map;

/* 26 Ã‚
 * removeDuplicates
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, 
 * with the first two elements of nums being 1 and 2 respectively. 
 * It doesn't matter what you leave beyond the new length.
 * 
 *  Remove Element
 *  Given input array nums = [3,2,2,3], val = 3
 *  Your function should return length = 2, 
 *  with the first two elements of nums being 2.
 */
public class Remove_Duplicates_from_Sorted_Array {

	public int removeDuplicates(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = {};
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				continue;
			} else {
				map.put(nums[i], i);
				result[j++] = nums[i];
			}
		}
		return result.length;
	}

	public int removeElement(int[] nums, int val) {
		int j=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==val){
				continue;
			}else{
				nums[j++]=nums[i];
			}
		}
		return j;
	}

	public static void main(String[] args) {
		int[] test = { 1, 3, 3, 3, 5, 6, 7, 7, 8 };
		Remove_Duplicates_from_Sorted_Array rdfsa = new Remove_Duplicates_from_Sorted_Array();
		//System.out.println(rdfsa.removeDuplicates(test));
		System.out.println(rdfsa.removeElement(test, 3));
	}

}

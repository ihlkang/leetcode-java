package Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 1 题
 * Given nums = [2, 7, 11, 15], target = 9
 * Because nums[0] + nums[1] = 2 + 7 = 9
 * return [0, 1].
 */
public class two_Sum {
	public int [] Sum(int[] nums,int target){
		int i;
		int[] result = new int[2];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(i=0;i<nums.length;i++){
			//判断map中是否包含该数值
			if(map.containsKey(target-nums[i])){
				result[1]=i;
				result[0]=map.get(target-nums[i]);
				return result;
			}else{
				map.put(nums[i], i);
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		int[] result={1,2,5,6,8};
		int[] a={};
		int i;
		two_Sum test=new two_Sum();
		a=test.Sum(result,11);
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}


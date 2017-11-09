package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 47题
 * Given a collection of numbers that might contain duplicates, 
 * return all possible unique permutations.
 */
public class Permutations2 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		backtrack(list,new ArrayList<Integer>(),nums,new boolean[nums.length]);
		return list;
	}
	private void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] nums,boolean[] used){
		if(tempList.size()==nums.length)
			list.add(new ArrayList<>(tempList));
		else{
			for(int i=0;i<nums.length;i++){
				//排序后，如果第二个数与第一个数相同，同时第一个数没使用的情况下，
				//使用第二个数说明第一个数已经用完一遍了，直接跳过.
				if(used[i] || (i>0 && nums[i]==nums[i-1] && !used[i-1]))
					continue;
				used[i]=true;
				tempList.add(nums[i]);
				backtrack(list,tempList,nums,used);
				used[i]=false;
				tempList.remove(tempList.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		int[] nums=new int[]{3,4,3};
		Permutations2 per=new Permutations2();
		per.permuteUnique(nums);
	}

}

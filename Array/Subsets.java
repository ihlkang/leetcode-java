package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 78 Ìâ
 * Given a set of distinct integers, 
 * nums, return all possible subsets.
 */
public class Subsets {
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list=new ArrayList<>();
		Arrays.sort(nums);
		backtrack(nums,0,list, new ArrayList<>());
		return list;
	}
	public void backtrack(int[] nums,int start,List<List<Integer>> list,List<Integer> temp){
		
		list.add(new ArrayList<>(temp));
		for(int i=start;i<nums.length;i++){
			temp.add(nums[i]);
			backtrack(nums, i+1,list, temp);
			temp.remove(temp.size()-1);
		}
	}
	public static void main(String[] args) {
		Subsets ss=new Subsets();
		ss.subsets(new int[]{1,2,3});
	}

}

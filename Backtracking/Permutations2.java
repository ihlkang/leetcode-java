package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 47��
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
				//���������ڶ��������һ������ͬ��ͬʱ��һ����ûʹ�õ�����£�
				//ʹ�õڶ�����˵����һ�����Ѿ�����һ���ˣ�ֱ������.
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

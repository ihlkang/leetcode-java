package Array;
/*
 *  39Ìâ
 */
import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list=new ArrayList<>();
		backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
		return list;
	}
	private void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] nums,int remain_target,int start){
		if(remain_target<0)
			return;
		else if(remain_target==0)
			list.add(new ArrayList<>(tempList));
		else{
			for(int i=start;i<nums.length;i++){
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain_target-nums[i],i);
				tempList.remove(tempList.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		Combination_Sum cs=new Combination_Sum();
		cs.combinationSum(new int[]{2,3,6,7},7);
	}

}

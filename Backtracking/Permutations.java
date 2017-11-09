package Backtracking;

/* 46��
 * Given a collection of distinct numbers, return all possible permutations.
 * [1,2,3] have the following permutations:[[1,2,3],[1,3,2],[2,1,3],
 * [2,3,1],[3,1,2],[3,2,1]]
 */
import java.util.List;
import java.util.ArrayList;

public class Permutations {
	
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		backtrack(list,new ArrayList<Integer>(),nums);
		return list;
	}
	private void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] nums){
		if(tempList.size()==nums.length)
			list.add(new ArrayList<>(tempList));//����ֱ�ӽ�tempList���룬Ҫ���´���һ��ArrayList��
			//��Ȼlist�е�Ԫ�ض���һ����
		else{
			for(int i=0;i<nums.length;i++){
				if(tempList.contains(nums[i]))
					continue;
				tempList.add(nums[i]);
				backtrack(list,tempList,nums);
				tempList.remove(tempList.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		int[] nums=new int[]{1,2,3};
		Permutations per=new Permutations();
		per.permute(nums);
	}
	
}

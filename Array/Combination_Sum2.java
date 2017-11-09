package Array;
/*
 *  40��
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum2 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list=new ArrayList<>();
		Arrays.sort(candidates);
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
				//�����Ƿ�ֹ�ظ�ʹ���Ѿ��жϲ��ܴﵽĿ�ĵ�Ԫ�أ���η�ֹ�ظ����������
				if(i>start && nums[i]==nums[i-1])
	                    continue;
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain_target-nums[i],i+1);//�����ظ�ʹ��candidates�е�Ԫ��
				tempList.remove(tempList.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		Combination_Sum2 cs=new Combination_Sum2();
		cs.combinationSum(new int[]{1,1,2,3,3,6,7},8);
	}
}

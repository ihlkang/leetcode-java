package Array;

/* 34 题
 * For example
 * Given [5, 7, 7, 8, 8, 10] and target value 8
 * return [3, 4].
 * 首先找到目标的最小下标，即目标开始的位置，接着找到目标值加1的最小下标，即原目标结束的位置
 */
public class Search_for_Range {
	public int[] searchRange(int[] nums, int target) {
		
		int start=findindex(nums, target);
		if(start==nums.length || nums[start]!=target){
			return new int[]{-1,-1};
		}
		return new int[]{start,findindex(nums, target+1)-1};
		
	}
	public int findindex(int[] nums, int target){
		int l=0,r=nums.length;
		int mid=0;
		while(l<r){
			mid=(l+r)/2;
			if(nums[mid]<target){
				l=mid+1;
			}else{
				r=mid;
			}
		}
		return l;
	}
	public static void main(String[] args) {
		int[] nums={1,4};
		Search_for_Range sfr=new Search_for_Range();
		nums=sfr.searchRange(nums,4);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
	}

}

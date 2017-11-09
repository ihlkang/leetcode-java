package Array;

/* 34 ��
 * For example
 * Given [5, 7, 7, 8, 8, 10] and target value 8
 * return [3, 4].
 * �����ҵ�Ŀ�����С�±꣬��Ŀ�꿪ʼ��λ�ã������ҵ�Ŀ��ֵ��1����С�±꣬��ԭĿ�������λ��
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

package Array;

/* 33 题
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. 
 * If found in the array return its index, otherwise return -1.
 */
public class Search_Rotated_Sorted_Array {

	public int search(int[] nums, int target) {
		int n=nums.length;
		int l=0,r=n-1;
		int mid,realmid;
		int rto;
		while(l<r){
			mid=(l+r)/2;
			if(nums[mid]>nums[r])
				l=mid+1;
			else
				r=mid;
		}
		rto=l;//由于给定序列是旋转后的序列，所以需要先确定起始点，然后将最后一个数与第一个数串起来组合成一个新的有序序列。
		l=0;
		r=n-1;
		while(l<=r){
			mid=(l+r)/2;
			realmid=(rto+mid)%n;
			if(nums[realmid]<target)
				l=mid+1;
			else if(nums[realmid]>target)
				r=mid-1;
			else
				return realmid;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums={4,5,6,7,0,1,2};
		Search_Rotated_Sorted_Array srsa=new Search_Rotated_Sorted_Array();
		System.out.println(srsa.search(nums, 7));
	}

}

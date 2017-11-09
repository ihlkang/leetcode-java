package Array;

/* 35 Ìâ
 * Here are few examples.
 * [1,3,5,6], 5 ¡ú 2
 * [1,3,5,6], 2 ¡ú 1
 * [1,3,5,6], 7 ¡ú 4
 * [1,3,5,6], 0 ¡ú 0
 */
public class Search_Insert_Position {
	public int searchInsert(int[] nums, int target) {
		int l=0,r=nums.length;
		int mid=0;
		while(l<r){
			mid=(l+r)/2;
			if(nums[mid]>target){
				r=mid;
			}else if(nums[mid]<target){
				l=mid+1;
			}else{
				return mid;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int[] nums={1,3,5,6};
		Search_Insert_Position sip=new Search_Insert_Position();
		System.out.println(sip.searchInsert(nums, 0));
	}

}

package Array;
/* 4 题
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 */
public class Median_of_Two_Sorted_Arrays {
	
	public double findMedianSortedArrays(int[] nums1,int[] nums2){
		int m=nums1.length;
		int n=nums2.length;
		int imin,imax,i,j,half;
		int[] temp;
		double max_of_left=0,min_of_right=0;
		if(m>n){
			temp=nums1;
			nums1=nums2;
			nums2=temp;
			m=nums1.length;
			n=nums2.length;
		}
		imin=0;
		imax=m;
		half=(m+n+1)/2;
		while(imin<=imax){
			i=(imin+imax)/2;
			j=half-i;
			if(i>0 && nums1[i-1]>nums2[j]){
				//i太大了，必须减小
				imax=i-1;
			}
			else if(i<m && nums2[j-1]>nums1[i]){
				//i太小了，必须增大
				imin=i+1;
			}
			else{
				if(i==0){
					max_of_left=nums2[j-1];
				}else if(j==0){
					max_of_left=nums1[i-1];
				}else{
					max_of_left=Math.max(nums1[i-1],nums2[j-1]);
				}
				if((m+n)%2!=0){
					return max_of_left;
				}
				if(i==m){
					min_of_right=nums2[j];
				}
				else if(j==n){
					min_of_right=nums1[i];
				}else{
					min_of_right=Math.min(nums1[i],nums2[j]);
				}
				return (max_of_left+min_of_right)/2.0;
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Median_of_Two_Sorted_Arrays m=new Median_of_Two_Sorted_Arrays();
		int[] a={1,3};
		int[] b={2};
		double result;
		result=m.findMedianSortedArrays(a,b);
		System.out.println(result);
	}

}

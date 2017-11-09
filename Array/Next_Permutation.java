package Array;
/*
 * 31 Ìâ
 */
public class Next_Permutation {

	public void nextPermutation(int[] nums) {
		int i=0;
		int n=nums.length;
		int cnt=0;
		int index=n-1;
		int temp;
        if(n<2)
            return;
		while(index>0){
            if(nums[index-1]<nums[index])
                break;
            index--;
        }
        if(index==0){
            reverse(nums,0,n-1);
        }else{
            temp=nums[index-1];
            int j=n-1;
            while(j>=index){
                if(nums[j]>temp)
                    break;
                j--;
            }
            swap(nums,index-1,j);
            reverse(nums,index,n-1);
        }
	    
		return;
	}
	public void reverse(int[] nums,int i,int j){
		if(i>j)
			return;
		for(int start=i;start<=(i+j)/2;start++){
			swap(nums,start,i+j-start);
		}
	}
	public void swap(int[] nums,int i,int j){
		int temp=0;
		temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	public static void main(String[] args) {
		Next_Permutation np=new Next_Permutation();
		int[] nums={1,3,4,5};
		np.nextPermutation(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}	
	}

}

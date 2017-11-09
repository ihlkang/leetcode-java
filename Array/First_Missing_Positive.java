package Array;
/* 41��Ŀ
 * For example
 * Given [1,2,0] return 3
 * and [3,4,-1,1] return 2
 */
//�ҵ���һ��ȱʧ������
public class First_Missing_Positive {
	
	public int firstMissingPositive(int[] nums) {
	     int len=nums.length;
	     int q=-1,temp=0;
	     if(len==0)
	    	 return 1;
	     for(int i=0;i<len;i++){
	    	 if(nums[i]>0){//qֻ����nums[i]ֵ����0���Լ�,Ҳ����˵qͣ����nums[i]ֵС��0��λ��
	    		 q++;
	    		 swap(nums,q,i);//����ǰ������nums[i]�븺��nums[q]����
	    	 }
	     }
	     for(int j=0;j<q+1;j++){
	    	 temp=Math.abs(nums[j]);
	    	 if(temp<=q+1)
	    		 nums[temp-1]=(nums[temp-1]<0)?nums[temp-1]:-nums[temp-1];
	     }
	     for(int x=0;x<len;x++){
	    	 if(nums[x]>0)
	    		 return x+1;
	     }
	     return q+2; 
	}
	//������
	public int firstMissingPositiveII(int[] nums) {
		
		for(int i=0;i<nums.length;i++){
			//ע��while()���ã�ֻҪ��ǰλ�õ�ֵ����С��0������n����ȷ������һֱѭ��
			while(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1]){
				swap(nums,i,nums[i]-1);
			}
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=i+1){
				return i+1;
			}
		}
		return nums.length;
	}
	private void swap(int[] nums,int i, int j) {
		if(i!=j){
			int temp;
			temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
		}
	}
	public static void main(String[] args) {
		int[] nums={3,4,-1,1};
		First_Missing_Positive fmp=new First_Missing_Positive();
		@SuppressWarnings("unused")//ע�⣬suppressWarning������ûʹ�þ���
		int result=fmp.firstMissingPositive(nums);
	}
}
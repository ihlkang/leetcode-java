package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Largest_Element {

	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue=new 
				PriorityQueue<Integer>(nums.length,new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						if(o1>o2)
							return -1;
						else if(o1==o2)
							return 0;
						else
							return 1;
					}
		});
		for(int i=0;i<nums.length;i++)
		{
			queue.add(nums[i]);
		}
		Integer result=0;
		while((k--)!=0){
			result=queue.poll();
		}
		return result;
		
 	}

	public static void main(String[] args) {

	}

}

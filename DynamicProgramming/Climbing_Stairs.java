package DynamicProgramming;
/*
 * 70Ã‚
 */
import java.util.LinkedList;
import java.util.Queue;

public class Climbing_Stairs {

	public int climbStairs(int n) {
       Queue<Integer> queue=new LinkedList<>();
       int count=0;
       if(n<=1)
    	   return n;
       queue.add(1);
       queue.add(2);
       while(!queue.isEmpty()){
    	   int x=queue.poll();
    	   if(x>=n){
    		   count++;
    	   }
    	   queue.add(x+1);
    	   queue.add(x+2);   
       }
       return count;
    }
	
	public static void main(String[] args) {
		
	}

}

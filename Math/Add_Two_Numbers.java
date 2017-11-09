package Math;

import java.awt.List;


/* 2 Ìâ
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Add_Two_Numbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode c1=l1;
		ListNode c2=l2;
		ListNode result=new ListNode(0);
		ListNode step=result;
		int sum=0;
		while(c1!=null || c2!=null){
			sum/=10;
			if(c1!=null){
				sum+=c1.val;
				c1=c1.next;
			}
			if(c2!=null){
				sum+=c2.val;
				c2=c2.next;
			}
			step.next=new ListNode(sum%10);
			step=step.next;
		}
		if(sum/10 ==1){
			step.next=new ListNode(1);
		}
		return result.next;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(0);
		ListNode l2=new ListNode(0);
		ListNode t1=l1;
		ListNode t2=l2;
		ListNode result=new ListNode(0);
		for(int i=1;i<4;i++){
			l1.next=new ListNode(i);
			l2.next=new ListNode(5-i);
			l1=l1.next;
			l2=l2.next;
		}
		Add_Two_Numbers add=new Add_Two_Numbers();
		result.next=add.addTwoNumbers(t1.next, t2.next);
		while(result.next!=null){
			System.out.println(result.next.val);
			result=result.next;
		}

	}

}

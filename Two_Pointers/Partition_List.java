package Two_Pointers;
/*
 * 86Ã‚
 */
public class Partition_List {
	
	public ListNode partition(ListNode head, int x) {
		ListNode dummy1=new ListNode(0),dummy2=new ListNode(0);
		ListNode curr1=dummy1,curr2=dummy2;
		while(head!=null){
			if(head.val<x){
				curr1.next=new ListNode(head.val);
				curr1=curr1.next;
			}else{
				curr2.next=new ListNode(head.val);
				curr2=curr2.next;
			}
			head=head.next;
		}
		curr2.next=null;
		curr1.next=dummy2;
		return dummy1;
	}

	public static void main(String[] args) {
		
	}

}
class ListNode {
	  int val;
	  ListNode next;
	  ListNode(int x) { val = x; }
	}

package LinkedList;

import java.awt.List;

/*
 * 83 Ã‚
 * 
 */

public class Remove_Duplicates {

	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode list=head;
		while(list!=null){
			if(list.next==null){
				break;
			}
			if(list.val==list.next.val){
				list.next=list.next.next;
			}else{
				list=list.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		Remove_Duplicates rd=new Remove_Duplicates();
		ListNode head=null,list=null;
		head=list;
		list.next=new ListNode(1);
		list=list.next;
		list.next=new ListNode(1);
		list=list.next;
		list.next=new ListNode(2);
		list=list.next;
		list.next=new ListNode(2);
		list=list.next;
		list.next=null;
		rd.deleteDuplicates(head);
	}

}

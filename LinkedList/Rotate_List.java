package LinkedList;

// added to test branch and pull request
/*
 * 61Ìâ
 */
public class Rotate_List {

	public ListNode rotateRight(ListNode head, int k) {
		ListNode newNode,tailNode;
		newNode=tailNode=head;
		int len=1;
		if(head==null){
			return null;
		}
		while(tailNode.next!=null){
			tailNode=tailNode.next;
			len++;
		}
		tailNode.next=head;
		while(k>len){
			k=k%len;
		}
		if(k%len!=0){
			for(int i=0;i<len-k;i++){
				tailNode=tailNode.next;
			}
		}
		newNode=tailNode.next;
		tailNode.next=null;
		return newNode;	
	}
	public ListNode rotateRight2(ListNode head, int k) {
		ListNode slowNode,fastNode,newNode;
		slowNode=fastNode=head;
		int len=1;
		if(head==null){
			return head;
		}
		while((k--)!=0){
			if(fastNode.next!=null){
				fastNode=fastNode.next;
				len++;
			}else{
				fastNode=head;
				k%=len;
			}
		}
		while(fastNode.next!=null){
			fastNode=fastNode.next;
			slowNode=slowNode.next;
		}
		newNode=slowNode.next;
		slowNode.next=null;
		fastNode.next=head;
		return newNode;
	}
	public static void main(String[] args) {
		Rotate_List rl=new Rotate_List();
		ListNode head=new ListNode(1);
		ListNode test=head;
		for(int i=2;i<5;i++){
			head.next=new ListNode(i);
			head=head.next;
		}
		head.next=null;
		rl.rotateRight(test, 2);
	}

}

package Two_Pointers;
/*
 * 86
 */
public class Partition_List {
	
	public Node partition(Node head, int x) {
		Node dummy1=new Node(0),dummy2=new Node(0);
		Node curr1=dummy1,curr2=dummy2;
		while(head!=null){
			if(head.val<x){
				curr1.next=new Node(head.val);
				curr1=curr1.next;
			}else{
				curr2.next=new Node(head.val);
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

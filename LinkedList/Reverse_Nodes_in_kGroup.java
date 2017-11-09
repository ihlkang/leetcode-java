package LinkedList;

/* 25 Ìâ
 * Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 */
public class Reverse_Nodes_in_kGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode curr = head;
		int i = 0;
		while (curr != null && i != k) {
			curr = curr.next;
			i++;
		}
		if (i == k) {
			curr = reverseKGroup(curr, k);
			while (i-- > 0) {
				ListNode temp = head.next;
				head.next = curr;
				curr = head;
				head = temp;
			}
			head = curr;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(0);
		ListNode test = l1;
		ListNode result = new ListNode(0);
		for (int i = 0; i < 5; i++) {
			l1.next = new ListNode(i);
			l1 = l1.next;
		}
		Reverse_Nodes_in_kGroup rnik = new Reverse_Nodes_in_kGroup();
		result.next = rnik.reverseKGroup(test.next, 3);
		while (result.next != null) {
			System.out.println("result.val:" + result.next.val);
			result = result.next;
		}
	}

}

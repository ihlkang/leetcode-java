package Tree;
/*
 * 94
 */
import java.util.ArrayList;
import java.util.List;


public class Binary_Tree_Inorder_Traversal {

	public List<Integer> inorderTraversal(TreeNode root) {
	       List<Integer> list=new ArrayList<Integer>();
	       traversal(root,list);
	       return list;
	   }
	   public void traversal(TreeNode head,List<Integer> list){
	       if(head!=null){
	           traversal(head.left,list);
	           list.add(head.val);
	           traversal(head.right,list);
	       }
	   }
	public static void main(String[] args) {
		
	}

}

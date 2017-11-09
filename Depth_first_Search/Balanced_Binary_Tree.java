package Depth_first_Search;

public class Balanced_Binary_Tree {
	
	public boolean isBalanced(TreeNode root) {
		if(root==null)
			return true;
		int left=getDepth(root.left);
		int right=getDepth(root.right);
	
		return Math.abs(left-right)<=1 && isBalanced(root.left) && isBalanced(root.right);
	}
	public int getDepth(TreeNode root){
		if(root==null){
			return 0;
		}
		else{
			return Math.max(getDepth(root.left), getDepth(root.right))+1;
		}
	}
	public static void main(String[] args) {

	}

}
class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
package Tree;
/*
 * 95
 */
import java.util.ArrayList;
import java.util.List;



class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
public class Unique_Binary_SearchTreesII {
	public List<TreeNode> generateTrees(int n) {
		return genTrees(1,n);
	}
	public List<TreeNode> genTrees(int start,int end){
		List<TreeNode> list=new ArrayList<TreeNode>();
		if(start>end){
			list.add(null);
			return list;
		}
		if(start==end){
			list.add(new TreeNode(start));
		}
		List<TreeNode> left,right;
		for(int i=start;i<=end;i++){
			left=genTrees(start,i-1);
			right=genTrees(i+1,end);
			for(TreeNode lnode:left){
				for(TreeNode rnode:right){
					TreeNode root=new TreeNode(i);
					root.left=lnode;
					root.right=rnode;
					list.add(root);
				}
			}
		}
		return list;
	}
	public static void main(String[] args) {
		
	}

}

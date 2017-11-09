package Depth_first_Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list=new LinkedList<>();
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		if(root==null)
			return list;
		queue.add(root);
		while(!queue.isEmpty()){
			int size=queue.size();//计算前一层进队列个数
			List<Integer> l=new ArrayList<>();
			while(size-->0){
				TreeNode t=queue.poll();
				l.add(t.val);
				if(t.left!=null)
					queue.add(t.left);
				if(t.right!=null)
					queue.add(t.right);
			}
			list.add(l);
		}
		return list;
	}

	public static void main(String[] args) {

	}

}

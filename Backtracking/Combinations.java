package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 77 Ìâ
 * Given two integers n and k, 
 * return all possible combinations of k numbers out of 1 ... n.
 */
public class Combinations {
	
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list=new ArrayList<>();
		array(n,k,1,list,new ArrayList<>());
		return list;
	}
	public void array(int n,int k,int begin,List<List<Integer>> list,List<Integer> temp){
		if(temp.size()==k){
			list.add(new ArrayList<>(temp));
			return;
		}
		for(int i=begin;i<=n;i++){
				temp.add(i);
				array(n,k,i+1,list,temp);
				temp.remove(temp.size()-1);
		}
	}

	public static void main(String[] args) {
		Combinations com=new Combinations();
		com.combine(4, 2);
	}

}

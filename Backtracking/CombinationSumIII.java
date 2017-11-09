package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
	
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		List<Integer> l=new ArrayList<>();
		int sum=0;
		getsum(list,l,sum,1,k, n);
		return list;
	}
	public void getsum(List<List<Integer>> list,List<Integer> l,int sum,int start,int k,int n){
		if(sum==n && k==0){
			list.add(new ArrayList<Integer>(l));
			return;
		}else{
			if(sum>n){
				return;
			}
			if(k==0){
				return;
			}
			for(int i=start;i<=9;i++){
				l.add(i);
				getsum(list,l,sum+i,i+1,k-1,n);
				l.remove(l.size()-1);
			}
		}
	}
	public static void main(String[] args) {
		CombinationSumIII cs=new CombinationSumIII();
		cs.combinationSum3(3, 7);
	}

}

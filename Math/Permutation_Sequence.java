package Math;

import java.util.ArrayList;
import java.util.List;

/*
 * 60 Ã‚
 * Given n and k
 * return the kth permutation sequence
 */
public class Permutation_Sequence {
	
	public String getPermutation(int n, int k) {
		List<Integer> list=new ArrayList<>();
		int[] factorial=new int[n+1];
		int sum=1;
		factorial[0]=1;
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=n;i++){
			sum*=i;
			factorial[i]=sum;
		}
		for(int i=1;i<=n;i++){
			list.add(i);
		}
		k--;
		for(int i=1;i<=n;i++){
			int index=k/factorial[n-i];
			sb.append(String.valueOf(list.get(index)));
			list.remove(index);
			k-=index*factorial[n-i];
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Permutation_Sequence ps=new Permutation_Sequence();
		ps.getPermutation(2, 1);
	}

}

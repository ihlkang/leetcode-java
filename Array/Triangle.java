package Array;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	public int minimumTotal(List<List<Integer>> triangle) {
		List<Integer> min=triangle.get(triangle.size()-1);
		for(int i=triangle.size()-2;i>=0;i--){
			for(int k=0;k<=i;k++){
				min.set(k, Math.min(min.get(k),min.get(k+1))+triangle.get(i).get(k));
			}
		}
		return min.get(0);
	}

	public static void main(String[] args) {
		
	}

}

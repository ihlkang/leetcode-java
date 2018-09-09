package bishi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<Integer>();
        backtrap(result,temp,sum,1);
    }

    private static void backtrap(List<List<Integer>> result, List<Integer> temp, int sum, int start) {
        if(sum==0){
            result.add(new ArrayList<>(temp));
            return;
        }else if(sum<0){
            return;
        }else{
            for(int i=start;i<sum;i++){
                temp.add(start);
                backtrap(result,temp,sum-i,start+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}

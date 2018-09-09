package bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubArraysCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(),count=0;
        int[] arrays = new int[num];
        for(int i=0;i<num;i++){
            arrays[i] = sc.nextInt();
        }
        //System.out.println(getSubArraysCount(arrays));
        System.out.println(count);
    }

    private static int getSubArraysCount(int[] arrays) {
        int count = 0;
        int num = arrays.length/3;
        if(arrays.length<3){
            return 0;
        }
        for(int i=0;i<num;i++){
            List<List<Integer>> list = getList(arrays,i);
            if(!isSorted(list)){
                continue;
            }else{
                System.out.println(num);
            }
        }
        return count;
    }

    private static List<List<Integer>> getList(int[] arrays,int i) {
        List<List<Integer>> result = new ArrayList<>();
        int k =0;
        while(k<=i){
            List<Integer> temp = Arrays.asList(arrays[i*3+0],arrays[i*3+1],arrays[i*3+2]);
            result.add(new ArrayList<>(temp));
        }
        return result;
    }

    private static boolean isSorted(List<List<Integer>> result) {
        for(int i=0;i<result.size();i++){
            int length = result.get(i).size();
            for(int j=0;j<length-1;j++){
                if(result.get(i).get(j)>result.get(i).get(j+1)){
                    return false;
                }
            }
        }
        return true;
    }

}

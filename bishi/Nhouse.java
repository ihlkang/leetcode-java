package bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Nhouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n<=2 || k<2){
                System.out.println(0+" "+0);
            }else{
                System.out.println(getMinNum(n,k)+" "+getMaxNum(n,k));
            }
        }

    }

    private static int getMaxNum(int n, int k) {
        if(n==k){
            return 0;
        }else{
            if(n<k*2){
                return n-k;
            }else{
                return k-1;
            }
        }
    }

    private static int getMinNum(int n, int k) {
        int count = 0;
        return count;
    }

}

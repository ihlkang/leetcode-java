package bishi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Position {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            map.put(x,y);
        }
        System.out.println(0);
    }
}

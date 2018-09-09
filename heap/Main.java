package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean flag[];
    static List list=new ArrayList();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        flag=new boolean[n+1];
        int arr[][]=new int[n+1][n+1];
        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
        }
        for(int i=0;i<n;i++){
            flag[i+1]=true;
        }
        bfs(1,0,arr);
        int count=0;
        Collections.sort(list);
        int len=list.size();
        for(int i=0;i<len;i++){
            System.out.println(list.get(i));
            if(i==len-1)
                count+=(int)list.get(i);
            else
                count+=(int)list.get(i)*2;
        }
        System.out.println(count);

    }
    static void bfs(int start ,int len,int arr[][]){
        int n=arr.length-1;
        //访问到叶子节点就停止
        boolean end=false;
        for(int i=1;i<=n;i++){
            if(arr[start][i]==1&&flag[i]==true){
                flag[start]=false;
                end=true;
                bfs(i,len+1,arr);
            }
        }
        if(!end){
            list.add(len);
        }
    }

}

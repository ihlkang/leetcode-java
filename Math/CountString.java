package Math;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        Map map=new HashMap();
        int len=0;
        for(int i=0;i<n;i++){
            if(len==0){
                String temp=s.substring(i,i+1);
                if(map.containsKey(temp)){
                    int t=(int)map.get(temp);
                    map.put(temp,t+1);
                }else{
                    map.put(temp,1);
                }
                if(map.size()==26){
                    String sss=s.substring(0,i+1);
                    len=getLen(map,sss);
                    i=len;
                    map.clear();
                }
            }else{
                if(i+len>n){
                    break;
                }else{
                    String ss=s.substring(i,i+len);
                    for(int j=0;j<ss.length();j++){
                        String temp=s.substring(j,j+1);
                        if(map.containsKey(temp)){
                            int t=(int)map.get(temp);
                            map.put(temp,t+1);
                        }else{
                            map.put(temp,1);
                        }
                        if(map.size()==26){
                            len=getLen(map,ss.substring(0,j+1));
                            i=i+len;
                            break;
                        }
                    }
                    map.clear();
                }
            }


        }
        System.out.println(len);
    }
    public static int getLen(Map map,String s){
        int len=s.length();
        int size=len;
        for(int i=0;i<len;i++){
            String temp=s.substring(i,i+1);
            if((int)map.get(temp)>1){
                map.put(temp,(int)map.get(temp)-1);
                size--;
            }else{
                return size;
            }
        }
        return size;
    }

}

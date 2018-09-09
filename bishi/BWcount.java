package bishi;

import java.util.Scanner;

public class BWcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isRight(str)){
            System.out.println(str.length());
        }else{
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)!=str.charAt(i+1))
                    continue;
                else{
                    if(!isRight(str.substring(i+1,str.length()))){

                    }else{
                        if(str.charAt(0)!=str.charAt(str.length()-1)){
                            System.out.println(str.length());
                        }
                    }
                }
            }
        }
    }

    private static boolean isRight(String str) {
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}

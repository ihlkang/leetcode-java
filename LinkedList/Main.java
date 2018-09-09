package LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
        int i=0;

        List list=new ArrayList();
        String temp="";
        while(i<len){
            Zip zip=new Zip();
            if(s.substring(i,i+1).toCharArray()[0]>64){
                temp+=s.substring(i,i+1);

            }else{
                zip.setString(temp);
                temp=s.substring(i,i+1);
                i++;
                while(i<len&&s.substring(i,i+1).toCharArray()[0]<64){
                    temp+=s.substring(i,i+1);
                    i++;
                }
                zip.setNum(Integer.parseInt(temp));
                list.add(zip);
                if(i<len)
                    temp=s.substring(i,i+1);
            }
            i++;



        }
        Collections.sort(list, new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                Zip z1=(Zip)o1;
                Zip z2=(Zip)o2;
                if(z1.getNum().equals(z2.getNum())){
                    String a=z1.getString();
                    String b=z2.getString();
                    return compares(a,b);
                }
                return z1.getNum()-z2.getNum();
            }
        });
        int n=list.size();
        for(int j=0;j<n;j++){
            Zip z=(Zip)list.get(j);
            int num=z.getNum();
            String string=z.getString();
            for(int k=0;k<num;k++){
                System.out.print(string);
            }
        }



    }
    public static int compares(String a,String b){
        int aval=0;
        int bval=0;
        for(int i=0;i<a.length();i++){
            aval+=a.substring(i,i+1).toCharArray()[0];
        }
        for(int i=0;i<b.length();i++){
            bval+=b.substring(i,i+1).toCharArray()[0];
        }
        return aval-bval;
    }

}
    class Zip{
        String string;
        Integer num;

        public String getString() {
            return string;
        }

        public void setString(String string) {
            this.string = string;
        }

        public Integer getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }
    }

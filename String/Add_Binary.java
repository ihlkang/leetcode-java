package String;
/*
 * 67Ìâ
 */
public class Add_Binary {

	 public String addBinary(String a, String b) {
		 String result="";
		 int k=0,x=0;
		 int m=a.length()-1;
		 int n=b.length()-1;
		 while(m>=0 || n>=0){
			 if(m>=0)
				 x+=a.charAt(m--)-'0';
			 else
				 x+=0;
			 if(n>=0)
				 x+=b.charAt(n--)-'0';
			 else
				 x+=0;
			 result=(char)(x%2+'0')+result;
			 x=x/2;
		 }
		 result=(char)(x+'0')+result;
		 return result;
	 }

	public static void main(String[] args) {
		Add_Binary ab=new Add_Binary();
		ab.addBinary("11", "1");
	}

}

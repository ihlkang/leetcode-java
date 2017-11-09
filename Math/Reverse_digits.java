package Math;

/* 7 Ìâ
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class Reverse_digits {

	public int reverse(int x) {
		int ans=1;
		int result=0;
		if(x<0){
			ans=-1;
		}
		x=Math.abs(x);
		while(x!=0){
			int tail=x%10;
			int newresult=result*10+tail;
			if((newresult-tail)/10!=result){
				return 0;
			}
			result=newresult;
			x=x/10;
		}
		return result*ans;
	}
	 public int myAtoi(String str) {
	     int sign=1;
	     int result=0;
	     int i=0;
	     int base=0;
	     char[] c=str.toCharArray();
	     if(str.isEmpty()){
	    	 return 0;
	     }
	     while(i<c.length && c[i]==' '){
	    		 i++;
	     }
	     if(c[i]=='+' || c[i]=='-'){
	    	 sign=(c[i++]=='-')?-1:1;
	     }
	     while(i<c.length && c[i]<='0' && c[i]>='9'){
	    	 if(base/10>Integer.MAX_VALUE || (base/10==Integer.MAX_VALUE && c[i]>'7')){
	    		 return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
	    	 }
	    	 result=base*10+(c[i++]-'0');
	    	 base=result;
	     }
		 return result*sign; 
	}
	public static void main(String[] args) {
		Reverse_digits rd=new Reverse_digits();
		//System.out.println(rd.reverse(-3671));
		System.out.println(rd.myAtoi(""));
	}
}

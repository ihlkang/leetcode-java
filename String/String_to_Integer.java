package String;
/*
 * 8Ã‚
 */
public class String_to_Integer {
	
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
	     while(i<c.length && c[i]>='0' && c[i]<='9'){
	    	 if(base>Integer.MAX_VALUE/10 || (base==Integer.MAX_VALUE/10 && c[i]>'7')){
	    		 return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
	    	 }
	    	 result=base*10+(c[i++]-'0');
	    	 base=result;
	     }
		 return result*sign; 
   }
	public static void main(String[] args) {
		

	}

}

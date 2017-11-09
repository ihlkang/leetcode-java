package String;
/*
 *  38Ã‚
 */
import javax.naming.spi.DirStateFactory.Result;
public class Count_and_Say {
	
	public String countAndSay(int n) {
		String result=null;
		result=digui(n);
		return result;
	}
	
	private String digui(int n) {
		String s;
		StringBuffer sb=new StringBuffer();
		int start=0;
		if(n==1)
			return "1";
		else{
				s=digui(n-1);
				//if(s.length()==1)
					//sb.append("11");
				for(int i=0;i<s.length();i++){
					if(i+1>=s.length()){
						sb.append(i-start+1);
						sb.append((char)(s.charAt(start)));
						break;
					}
					if(s.charAt(i)==s.charAt(i+1)){
							continue;
					}
					else{
						sb.append(i-start+1);
						sb.append((char)(s.charAt(start)));
						start=i+1;
					}
				}
		}
		
		return sb.toString();
	}
	public String countSay(int n) {
		StringBuffer curr=new StringBuffer("1");
		StringBuffer prev;
		char index;
		int count;
		for(int i=1;i<n;i++){
			prev=curr;
			curr=new StringBuffer();
			count=1;
			index=prev.charAt(0);
			for(int j=1;j<prev.length();j++){
				if(index!=prev.charAt(j)){
					curr.append(count).append(index);
					count=1;
					index=prev.charAt(j);
				}
				else
					count++;
			}
			curr.append(count).append(index);
		}
		return curr.toString();
	}
	public static void main(String[] args) {
		Count_and_Say cas=new Count_and_Say();
		System.out.println(cas.countSay(7));
	}	
}

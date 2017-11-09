package String;

/* 5 Ã‚
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 */
public class Longest_Palindromic_Substring {
	
	private int maxlen=0,start=0;
	public String longestPalindrome(String s){
		if(s.length()<2){
			return s;
		}
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				match(s,i,i+1);
			}else{
				match(s,i,i);
			}
			
		}
		return s.substring(start, start+maxlen);
	}
	public void match(String s,int i,int j){
		while(i>=0 && j<=s.length() && s.charAt(i)==s.charAt(j)){
			i--;
			j++;
		}
		if(maxlen<j-i-1){
			maxlen=j-i-1;
			start=i+1;
		}
		
	}

	public static void main(String[] args){
		Longest_Palindromic_Substring lps=new Longest_Palindromic_Substring();
		String result=lps.longestPalindrome("abaccabc");
		System.out.println(result);
	}
}

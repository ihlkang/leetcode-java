package String;

public class ValidPalindromeII {
	
	public boolean validPalindrome(String s) {
		boolean result=false;
		int start=-1,end=s.length();
		while(start++<end--){
			if(s.charAt(start)!=s.charAt(end)){
				result=(getboolean(s,start,end-1) || getboolean(s, start+1, end));
				return result;
			}
		}
		return true;
	}
	private boolean getboolean(String sb, int start,int end) {
		
		while(start<end){
			if(sb.charAt(start)!=sb.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		ValidPalindromeII vpii=new ValidPalindromeII();
		vpii.validPalindrome("abca");
	}

}

package DynamicProgramming;

/* 44题
 * Some examples:
 * isMatch("aa","a") ? false
 * isMatch("aa","aa") ? true
 * isMatch("aaa","aa") ? false
 * isMatch("aa", "*") ? true
 * isMatch("aa", "a*") ? true
 * isMatch("ab", "?*") ? true
 * isMatch("aab", "c*a*b") ? false
 */
public class Wildcard_Matching {

	public boolean isMatch(String str, String pattern) {
		int s = 0, p = 0,startId=-1,match=0;
		while (s < str.length()) {
			//如果pattern串还没结束，str串和pattern串匹配则跳过该字符，匹配下一个字符
			if (p < pattern.length() && (str.charAt(s) == pattern.charAt(p) || pattern.charAt(p) == '?')) {
				p++;
				s++;
			}
			//如果pattern串匹配到'*'，则记录pattern开始点startId,str开始点match
			else if(p<pattern.length() && pattern.charAt(p)=='*'){
				startId=p;
				match=s;
				p++;
			}else if(startId!=-1){//如果记录了startId，说明pattern前一个字符为'*'，与str匹配当前字符位置为：startId+1
				p=startId+1;
				match++;
				s=match;
			}else{
				return false;
			}
		}
		//如果pattern还没匹配完，如果为'*'字符，则继续往右匹配，否则停止匹配.
		while(p<pattern.length() && pattern.charAt(p)=='*'){
			p++;
		}
		return p==pattern.length();
	}

	public static void main(String[] args) {

		Wildcard_Matching wm = new Wildcard_Matching();
		wm.isMatch("ab", "?*");

	}

}

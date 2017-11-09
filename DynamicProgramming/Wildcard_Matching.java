package DynamicProgramming;

/* 44��
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
			//���pattern����û������str����pattern��ƥ�����������ַ���ƥ����һ���ַ�
			if (p < pattern.length() && (str.charAt(s) == pattern.charAt(p) || pattern.charAt(p) == '?')) {
				p++;
				s++;
			}
			//���pattern��ƥ�䵽'*'�����¼pattern��ʼ��startId,str��ʼ��match
			else if(p<pattern.length() && pattern.charAt(p)=='*'){
				startId=p;
				match=s;
				p++;
			}else if(startId!=-1){//�����¼��startId��˵��patternǰһ���ַ�Ϊ'*'����strƥ�䵱ǰ�ַ�λ��Ϊ��startId+1
				p=startId+1;
				match++;
				s=match;
			}else{
				return false;
			}
		}
		//���pattern��ûƥ���꣬���Ϊ'*'�ַ������������ƥ�䣬����ֹͣƥ��.
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

package Math;

/* 29 Ã‚
 * Divide Two Integers
 * Divide two integers without using multiplication, 
 * division and mod operator.
 * If it is overflow, return MAX_INT.
 * 
 * 28 Ã‚
 * strStr
 * Returns the index of the first occurrence of needle in haystack, 
 * or -1 if needle is not part of haystack.
 */
public class Solution {

	public int strStr(String haystack, String needle) {
		int hlength = haystack.length();
		int nlength = needle.length();
		if (hlength < nlength) {
			return -1;
		}
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {

				if (j == nlength) {
					return i;
				}
				if (i + j == hlength) {
					return -1;
				}
				if (needle.charAt(j) != haystack.charAt(i + j)) {
					break;
				}
			}
		}

	}
	public int divide(int dividend,int divisor){
		int sign=1;
		if((dividend>0 && divisor<0)||(dividend<0 && divisor>0))
			sign=-1;
		long ldividend=Math.abs((long)dividend);
		long ldivisor=Math.abs((long)divisor);
		if(ldivisor==0){
			return Integer.MAX_VALUE;
		}
		if(ldividend<ldivisor || ldividend==0){
			return 0;
		}
		long lans=ldivide(ldividend, ldivisor);
		int ans;
		if(lans>Integer.MAX_VALUE){
			ans=(sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
		}else{
			ans=(int)(sign*lans);
		}
		return ans;
	}
	public long ldivide(long dividend, long divisor) {
		long multiple=1;
		long sum=divisor;
		if(dividend<divisor){
			return 0;
		}
		while((sum+sum)<=dividend){
			sum+=sum;
			multiple+=multiple;
		}
		return multiple+ldivide(dividend-sum, divisor);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		//System.out.println(solution.strStr("abcdefghijklmn", "def"));
		System.out.println(solution.divide(151, 23));
	}

}

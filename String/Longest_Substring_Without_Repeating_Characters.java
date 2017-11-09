package String;

import java.util.HashMap;
import java.util.Map;

/* 3 题
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. 
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Longest_Substring_Without_Repeating_Characters {

	 public int lengthOfLongestSubstring(String s) {
		 int max=0;
		 if(s.length()==0){
			 return 0;
		 }
		 Map<Character,Integer> map=new HashMap<Character,Integer>();
		 for(int i=0,start=0;i<s.length();++i){
			 if(map.containsKey(s.charAt(i))){
				 //如果发现重复字符，则j和重复字符的第一个的下一个位置的index比较，取较大值作为新的j值，
				 //j可视为新不重复字符串的起点
				 start=Math.max(start,map.get(s.charAt(i))+1);
			 }
			 max=Math.max(max, i-start+1);
			 map.put(s.charAt(i), i);
		 }
		 return max;
	}
	public static void main(String[] args) {
		Longest_Substring_Without_Repeating_Characters test=new 
				Longest_Substring_Without_Repeating_Characters();
		System.out.println(test.lengthOfLongestSubstring("abaabcab"));
				
	}

}

package String;
/*
 * 76题
 */
import java.util.HashMap;
import java.util.Map;

public class Minimum_WindowSubstring {
	
	public String minWindow(String s, String t) {
		String str="";
		char[] ch=t.toCharArray();
		char[] sh=s.toCharArray();
		int step=0,begin=0,end=0,head=0;
		int result_length=Integer.MAX_VALUE;
		Map<Character,Integer> map=new HashMap<>();
		for(char c:ch){
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}else{
				map.put(c,1);	
			}
		}
		for(char p:sh){
			if(map.containsKey(p)){
				continue;
			}
			map.put(p,0);
		}
		while(end<s.length()){
			if(map.get(s.charAt(end++))>0){
				step++;
			}//如果s中有t中元素,需要t的总元素数少一个，同时需要该元素个数也减一个；
			 //例如：t中有两个A，map中A的值为2,在s中扫描到A的时候将需要的总数少一个，需要的A也减一个
			map.put(s.charAt(end-1), map.get(s.charAt(end-1))-1);
			while(step==t.length()){
				if(end-begin<result_length){
					result_length=end-(head=begin);
				}
				if(map.get(s.charAt(begin++))==0){
					step--;
				}
				map.put(s.charAt(begin-1),map.get(s.charAt(begin-1))+1);
			}
		}
		if(result_length==Integer.MAX_VALUE){
			return "";
		}else{
			return s.substring(head, head+result_length);
		}
		
	}

	public static void main(String[] args) {
		Minimum_WindowSubstring mws=new Minimum_WindowSubstring();
		mws.minWindow("aa", "aa");
	}

}

package String;
/*
 * 76��
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
			}//���s����t��Ԫ��,��Ҫt����Ԫ������һ����ͬʱ��Ҫ��Ԫ�ظ���Ҳ��һ����
			 //���磺t��������A��map��A��ֵΪ2,��s��ɨ�赽A��ʱ����Ҫ��������һ������Ҫ��AҲ��һ��
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

package String;

import java.util.HashMap;
import java.util.Map;

/* 13 Ã‚
 * char_of_roman={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
 */
public class Roman_to_Interger {
	
	public int romanToInt(String s) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] c=s.toCharArray();
		int n=c.length;
		int result=0;
		int i=0;
		map.put('I', 1);
		map.put('V',5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		for(i=0;i<n-1;i++){
			if(map.get(c[i])<map.get(c[i+1])){
				result-=map.get(c[i]);
			}else{
				result+=map.get(c[i]);
			}
		}
		return result+map.get(c[i]);
	}
	public static void main(String[] args) {
		Roman_to_Interger rti=new Roman_to_Interger();
		System.out.println(rti.romanToInt("MCDXLIV"));
	}

}

package String;

import java.util.ArrayList;
import java.util.List;

/* 6 Ã‚
 * The string "PAYPALISHIRING" is written 
 * in a zigzag pattern on a given number of rows like this: 
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 */
public class ZigZag {
	public String convert(String s, int numRows) {
		char[] c=s.toCharArray();
		int len=c.length;
		StringBuffer[] sb=new StringBuffer[numRows];
		for(int i=0;i<sb.length;i++)
			sb[i]=new StringBuffer();
		int i=0;
		while(i<len){
			for(int idx=0;idx<numRows && i<len;idx++){
				sb[idx].append(c[i++]);
			}
			for(int iux=numRows-2;iux>0 && i<len;iux--){
				sb[iux].append(c[i++]);
			}
		}
		for(int x=1;x<sb.length;x++)
			sb[0].append(sb[x]);
		return sb[0].toString();
	}
	public static void main(String[] args) {
		ZigZag zz=new ZigZag();
		System.out.println(zz.convert("PAYPALISHIRING", 3));
	}

}

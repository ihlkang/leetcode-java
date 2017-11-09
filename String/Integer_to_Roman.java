package String;

/*
 * 12Ã‚
 * Given an integer, convert it to a roman numeral.
 * "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
 * "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"
 * "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
 * "M", "MM", "MMM"
 */
public class Integer_to_Roman {
	public String intToRoman(int num) {
		String[] s={"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] t={"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] c={"","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] m={"","M", "MM", "MMM"};
		StringBuffer sb=new StringBuffer();
		sb.append(m[num/1000]).append(c[num%1000/100]).append(t[num%100/10]).append(s[num%10]);
		return sb.toString();
		
	}
	public static void main(String[] args) {
		Integer_to_Roman itr=new Integer_to_Roman();
		itr.intToRoman(2345);
	}

}

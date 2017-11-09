package Stack;

import java.util.Stack;

public class Remove_K_Digits {

	public String removeKdigits(String num, int k) {
		int digits = num.length() - k;
        char[] stk = new char[num.length()];
        int top = 0;
        for (int i = 0; i < num.length(); ++i) {
            char c = num.charAt(i);
            while (top > 0 && stk[top-1] > c && k > 0) {
                top -= 1;
                k -= 1;
            }
            stk[top++] = c;
        }
   
        int idx = 0;
        while (idx < digits && stk[idx] == '0') idx++;
        return idx == digits? "0": new String(stk, idx, digits - idx);
	}

	public static void main(String[] args) {
		Remove_K_Digits rkd=new Remove_K_Digits();
		rkd.removeKdigits("1432219", 3);
	}

}
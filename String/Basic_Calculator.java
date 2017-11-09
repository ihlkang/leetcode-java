package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Basic_Calculator {

	public int calculate(String s) {
		int num = 0;
		int sign = 1;
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				num = num * 10 + (int)s.charAt(i) - '0';
			}
			if (s.charAt(i) == '+') {
				result += num * sign;
				sign = 1;
				num = 0;
			}
			if (s.charAt(i) == '-') {
				result += num * sign;
				sign = -1;
				num = 0;
			}
			if (s.charAt(i) == '(') {
				stack.push(result);// ��(ǰ���result����stack�У�����result��0
				stack.push(sign);
				sign = 1;
				result = 0;
			}
			if (s.charAt(i) == ')') {
				result += num * sign;// (��)��resultֵ
				num = 0;
				result *= stack.pop();
				result += stack.pop();

			}

		}

		if (num != 0)
			result += num * sign;
		return result;
	}

	public static void main(String[] args) {
		Basic_Calculator bc = new Basic_Calculator();
		bc.calculate("(1+(4+5+2)-3)+(6+8)");
	}

}

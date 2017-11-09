package String;

import java.util.Stack;

class priority{
	char c;
	int priority;
}
public class Basic_CalculatorIII {

	public int calculate(String s) {
		int result = 0;
		int num = 0;
		int sign = 1;
		Stack<priority> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isDigit(s.charAt(i))) {
				num = num * 10 + s.charAt(i) - '0';
			}
			if (!Character.isDigit(s.charAt(i))) {
				
				if(s.charAt(i)=='('){
					
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		Basic_CalculatorIII bcIII = new Basic_CalculatorIII();
		bcIII.calculate("(1+2/1)*((1-2)*1))");
	}

}

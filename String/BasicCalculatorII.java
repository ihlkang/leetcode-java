package String;

import java.util.Stack;

public class BasicCalculatorII {
	
	public int calculate(String s) {
		int result=0;
		int num=0;
		char sign='+';
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				num=num*10+(s.charAt(i)-'0');
			}
			if((!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ')|| i==s.length()-1){
				if(sign=='+'){
					stack.push(num);
				}
				if(sign=='-'){
					stack.push(-num);
				}
				if(sign=='*'){
					stack.push(stack.pop()*num);
				}
				if(sign=='/'){
					stack.push(stack.pop()/num);
				}
				sign=s.charAt(i);
				num=0;
			}
			
		}
		for(Integer i:stack){
			result+=i;
		}
		return result;
	}

	public static void main(String[] args) {
		BasicCalculatorII bc=new BasicCalculatorII();
		bc.calculate("4/3+2");
	}

}

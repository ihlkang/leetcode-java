package String;

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* 20 Ã‚
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order, 
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 
 * Longest Valid Parentheses
 * Given a string containing just the characters '(' and ')', 
 * find the length of the longest valid (well-formed) parentheses substring.
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 */
public class Valid_Parenthese {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (Character c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

	public int longestValidParentheses(String s) {
		Stack<Integer> stack=new Stack<Integer>();
		char[] c=s.toCharArray();
		int n=s.length(),result=0;
		for(int i=0;i<n;i++){
			if(c[i]=='(')
				stack.push(i);
			else{
				if(!stack.isEmpty()){
					if(s.charAt(stack.peek())==')')
						stack.push(i);
					else
						stack.pop();
				}
				else{
					stack.push(i);
				}
			}
		}
		if(stack.isEmpty())
			return n;
		else{
			int a=n,b=0;
			while(!stack.isEmpty()){
				b=stack.peek();
				stack.pop();
				result=Math.max(result, a-b-1);
				a=b;
			}
			result=Math.max(a, result);
		}
		return result;
	}

	public static void main(String[] args) {
		Valid_Parenthese vp = new Valid_Parenthese();
		//System.out.println(vp.isValid("()[]"));
		System.out.println(vp.longestValidParentheses(")()())()()("));
	}

}

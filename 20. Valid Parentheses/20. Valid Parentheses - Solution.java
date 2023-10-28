import java.util.Stack;

public class Solution {
	public static boolean isValid(String s) {
		Stack<String> stack = new Stack<>();
		stack.push(String.valueOf(s.charAt(0)));
		String topElement = "";
		for (int i = 1; i < s.length(); i++) {
			if(stack.empty() == false) {
				topElement = stack.peek();
			}
			else {
				topElement = "";
			}
			if (topElement.equals("(") && String.valueOf(s.charAt(i)).equals(")") || 
				topElement.equals("{") && String.valueOf(s.charAt(i)).equals("}") || 
				topElement.equals("[") && String.valueOf(s.charAt(i)).equals("]") ) {
				stack.pop();
			}
			else {
				stack.push(String.valueOf(s.charAt(i)));
			}
		}
		if(stack.empty() == false) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
	}
}

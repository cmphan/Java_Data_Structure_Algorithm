/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/
/*===========
Cuong Phan
O(n) Time
O(1) Space
Solution using Stack 
============*/

import java.util.Stack;
public class validParentheses 
{
	public static boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for (Character c: s.toCharArray())
		{
			if(c=='(') stack.push(')');
			else if(c=='{') stack.push('}');
			else if(c=='[') stack.push(']');
			else if (stack.empty() || stack.pop()!=c) return false;
		}
		return stack.isEmpty();
	}
	public static void main(String[] args)
	{
		String[] input_array = new String[]{"()","()[]{}","(]","([)]","{[]}","({[[]}])", "[{]}", "){", "(([]){})"};
		for (int i=0; i<input_array.length; i++)
		{
			if(isValid(input_array[i]))
			{
				System.out.println(input_array[i] + " is valid");
			}
			else 
			{
				System.out.println(input_array[i] + " is not valid");
			}
		}
	}
}
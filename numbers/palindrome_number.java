/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

/*===================
Cuong Phan
Time: O(log(x)) (log base 10)
Space O(1) 
Half - reverse => avoid overflow
=====================*/
public class palindrome_number
{
	public static boolean is_palindrome_number(int x)
	{
		if(x<0 || x %10 ==0 && x != 0) return false;
		int reverse = 0;
		while (x>reverse)
		{
			reverse = (reverse*10) + x % 10;
			x /=10;
		}
		return x == reverse || x==reverse/10;
	}
	public static void main(String[] args)
	{
		int[] input = new int[]{121,12321,-122,12345,99999};
		for (int i=0; i<input.length; i++)
		{
			if(is_palindrome_number(input[i])) System.out.println(input[i] + " is a palindrome number");
			else 
			System.out.println(input[i] + " is not a palindrome number");
		}
	}
}
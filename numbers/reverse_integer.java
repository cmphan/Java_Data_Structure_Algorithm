/*Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
*/
/* =====
Cuong Phan
Space: O(1)
Time O(log10(x))
Solution
========== */

public class reverse_integer
{
	public static int reverse(int x)
	{
		boolean negative_number = false;
		if (x<0)
		{
			negative_number = true;
			x = -x;
		}
		int digit = 0, result = 0, prev_result =0;
		while (x!=0)
		{
			digit = x % 10;
			result = (result*10) + digit;
			if ((result-digit)/10 != prev_result) 
			{return 0;}
			prev_result = result;
			x /=10;
		}
		return (negative_number==true)? -result : result;
	}
	public static void main(String[] args)
	{
		int index;
		index = reverse(-1234);
		System.out.print(index);
	}
}
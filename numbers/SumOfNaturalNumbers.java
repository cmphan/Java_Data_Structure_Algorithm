/* This program calculate sum of the first n natural numbers
sum = 1+2+3+4+5+.... +n 
1. Using recursion => Time O(n), Space: O(n)
2. Using For loop => Time O(n), Space: O(1)
3. Using formula 
sum = 1+2+3+4+...+n = n(n+1)/2 => Time O(1) and Space: O(1)
*/

public class SumOfNaturalNumbers
{
	//Using recursion 
	public static int sum_recursion(int n)
	{
		if (n>0)
			return sum_recursion(n-1)+n;
		else 
			return 0;
	}
	//Using for loop
	public static int sum_forLoop(int n)
	{
		int sum =0;
		for (int i=0; i<=n; i++)
		{
			sum+=i;
		}
		return sum;
	}
	//Using formula
	public static int sum_formula(int n)
	{
		return n*(n+1)/2;
	}
	public static void main(String[] args)
	{
		int n = 10;
		System.out.println(sum_recursion(n));
		System.out.println(sum_forLoop(n));
		System.out.println(sum_formula(n));
		
	}
}
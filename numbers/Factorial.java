/*This program calculate factorial of a given number */
public class Factorial
{
	//Using recursion 
	//Time: O(n), Space: O(n)
	public static int Factorial_recursion(int n)
	{
		if(n==0)
			return 1;
		else 
			return Factorial_recursion(n-1)*n;
	}
	//Using for loop
	//Time: O(n), Space: O(1)
	public static int Factorial_forLoop(int n)
	{
		int result =1;
		if(n==0)
			return 1;
		else 
		{
			for (int i=1; i<=n; i++)
			{
				result = result*i;
			}		
		}
		return result;
	}
	public static void main(String[] args)
	{
		int n=10;
		System.out.println(Factorial_recursion(n));
		System.out.println(Factorial_forLoop(n));
	}
}
/* This program calculates Fibonacci number
Define: F(n) = F(n-1) + F(n-2);
*/
public class Fibonacci_number {
	//Using iterative loop method 
	//Time: O(n)
	//Space: O(1)
	public static int Fibonacci_Loop(int n)
	{
		int n1=1, n2=1, n3 = 2;
		//Base case
		if(n<=1) return n;
		for (int i=3; i<=n; i++)
		{
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}
	//Using recursion with memorization
	//Time: O(n);
	//Space: O(n);
	public static int Fibonacci_recursion(int n, int[] Fib)
	{
		if(n<=1)
			return n;
		else
		{
			//If F[n-1] or F[n-2] is no calculate => call function to calculate from bottom up
			if(Fib[n-1] == -1) Fib[n-1] = Fibonacci_recursion(n-1,Fib);
			if (Fib[n-2]==-1) Fib[n-2] = Fibonacci_recursion(n-2,Fib);
			return Fib[n-1] + Fib[n-2];
		}
	}
	public static void main(String[] args)
	{
		int n = 10;
		System.out.println(Fibonacci_Loop(n));
		//Using recursion needs an array for memorization and reduce the number of function calls
		int[] Fib = new int[n];
		for (int i=0; i<Fib.length; i++)
		{
			Fib[i] = -1;
		}
		System.out.println(Fibonacci_recursion(n, Fib));
	}
}
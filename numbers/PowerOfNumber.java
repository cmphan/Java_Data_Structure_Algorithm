/*This program calculates power of a given number 
m^n 
*/
public class PowerOfNumber
{
	/* Brute force take O(n) with n= number of multiplications */
	public static int power_recursion(int m,int n)
	{
		if(n==0)
			return 1;
		else 
			return power_recursion(m,n-1)*m;
	}
	/*Power calculation using divide and conquer approach
	 a^n = a^(n/2) x a^(n/2) if n is even
	 a^n = a^(n-1)/2 x a^(n-1)/2 x a if n is odd
	 T(n) = T(n/2) + O(1) => O(lg(n)) with T(n) = number of multiplications to compute
	 */
	
	public static int power_divide_conquer(int m,int n)
	{
		if(n==0)
			return 1;
		else if (n%2==0)
			return power_divide_conquer(m*m,n/2);
		else 
			return m*power_divide_conquer(m*m,(n-1)/2);
	}
	public static void main(String[] args)
	{
		int n = 10;
		int m = 2;
		System.out.println(power_recursion(m,n));
		System.out.println(power_divide_conquer(m,n));
	}
}
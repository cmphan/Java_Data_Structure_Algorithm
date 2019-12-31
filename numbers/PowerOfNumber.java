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
	
	public static double power_divide_conquer(double m,int n)
	{
		//Base case
		if(n==0)
			return 1;
		//Some special cases
		else if(m==1) return 1;
		else if(m==-1 && n % 2 ==0) return 1;
		else if(m==-1 && n%2 !=0) return -1;
		//Overflow cases => return 0;
		else if (n<=Integer.MIN_VALUE || n >= Integer.MAX_VALUE) return 0;
		boolean negative = false;
		if(n<0)
		{
			negative = true;
			n = -n;
		}
		if (n%2==0)
		{
			if(negative) return power_divide_conquer((1/m)*(1/m),n/2);
			else
			return power_divide_conquer(m*m,n/2);
		}

		else 
		{
			if(negative) return 1/m*power_divide_conquer((1/m)*(1/m),(n-1)/2);
			else 
			return m*power_divide_conquer(m*m,(n-1)/2);
		}
			
	}
	public static void main(String[] args)
	{
		int n = -4;
		double m = 2;
		//System.out.println(power_recursion(m,n));
		System.out.println(power_divide_conquer(m,n));
	}
}
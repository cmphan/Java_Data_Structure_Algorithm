/*Cuong Phan
Find one missing element in an array
Input: a contiguous array of number
Output: missing number */
public class OneMissingElement
{
	//Find missing element by difference of value and its index
	public static int FindOneMissingElement(int[] input_array)
	{
		int difference = input_array[0];
		for (int i=0; i<input_array.length; i++)
		{
			if(input_array[i]-i!=difference)
			{
				return input_array[i] - difference;
			}
		}
		return -1;
	}
	public static void main (String[] args)
	{
		int[] input_array = new int[]{1,2,3,4,6,7,8};
		if (FindOneMissingElement(input_array)!= -1)
		{
			System.out.println("Missing element is: " + FindOneMissingElement(input_array));
		}
		else 
		System.out.println("There is no missing element in the array");
	}
}
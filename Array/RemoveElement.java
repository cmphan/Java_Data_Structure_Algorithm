/*Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.

*/
public class RemoveElement{
	public static int remove(int[] nums, int val)
	{
		if(nums.length==0) return 0;
		else if (nums.length==1)
		{
			if (nums[0]==val) return 0;
			else return 1;
		}
		int j =0;
		for (int i=0; i<nums.length; i++)
		{
			if(nums[i]!=val)
			{
				nums[j++] = nums[i];
			}
		}
		return j;
	}
	public static void Print(int[] nums, int length)
	{
		for (int i=0; i<length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] input_1 = new int[]{3,2,2,3};
		int[] input_2 = new int[]{0,1,2,2,3,0,4,2};
		int length_1 = remove(input_1,3);
		int length_2 = remove(input_2,2);
		Print(input_1,length_1);
		Print(input_2,length_2);
	}
}
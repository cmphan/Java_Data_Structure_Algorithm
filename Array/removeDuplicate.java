/*Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
*/
/* Cuong Phan
This solution takes O(n) time and 
O(1) space without taking any extra space */
public class removeDuplicate{
	public static int removeDuplicates(int [] nums)
	{	
		if (nums.length<=1) return nums.length;
		int length =1;
		int current = nums[0];
		for (int i=1; i<nums.length; i++)
		{
			if(current==nums[i])
			{
				continue;
			}
			else
			{
				nums[length] = nums[i];
				current = nums[i];
				length++;
			}
		}
		return length;
	}
	public static void Print(int[] nums, int length)
	{
		for (int i=0; i<length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
	public static void main (String[] args)
	{
		int[] nums = new int[]{1,1,2};
		int[] nums_2 = new int[]{0,0,1,1,1,2,2,3,3,4};
		int length_1 = removeDuplicates(nums);
		int length_2 = removeDuplicates(nums_2);
		Print(nums,length_1);
		Print(nums_2,length_2);
	}

}
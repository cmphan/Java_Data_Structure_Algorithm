import java.util.HashMap;
public class twosum
{
	public static int[] twoSum(int[] nums, int target)
	{
    	int [] indices = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }
            else 
            {
                if (nums[i] == target-nums[i]) 
                {
                    indices[0] = i;
                    indices[1] = map.get(target-nums[i]);
                    return indices;
                }
            }
        }
        for (int j=0; j<nums.length; j++)
        {
            if (map.containsKey(target-nums[j]) && map.get(target-nums[j])!=j)
            {
                indices[0] = j;
                indices[1] = map.get(target-nums[j]);
                return indices;
            }
        }
        return indices;
    }
	public static void main(String[]args)
	{
		int[] nums = new int[]{3,2,4};
		int target = 6;
		int [] result = new int[2];
		result = twoSum(nums, target);
		for (int i=0; i<result.length; i++)
		{
			System.out.print(result[i] + " ");
		}
	}
}
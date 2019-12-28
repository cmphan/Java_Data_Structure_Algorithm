/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */

//Cuong Phan

public class longestCommonPrefix
{
	//O(n) Time O(n) Space solution
	public static String prefix(String[] strs)
	{
		int[] common_array = new int[257];
		StringBuffer result = new StringBuffer(); 
		int min_length = strs[0].length();
		int p =1;
		while (p<strs.length)
		{
			if(strs[p].length()< min_length) min_length = strs[p].length();
			p++;
		}
		for (int i=0; i<257; i++)
		{
			common_array[i] = 0;
		}
		for (int j=0; j<strs.length; j++)
		{
			for(int k=0; k<strs[j].length(); k++)
			{
				common_array[strs[j].charAt(k)]++;
			}
		}
		for (int l=0; l<min_length; l++)
		{
			if(common_array[strs[0].charAt(l)] == strs.length)
			{
				result.append(strs[0].charAt(l));
			}
		} 
		return (result.toString().length()==0)? "": result.toString();
	}
	//O(n) Time and O(n) Space solution
	public static String common_prefix(String[] strs)
	{	
		int min_length =0;
		if(strs.length>0)
		{
			min_length = strs[0].length();
		}
		else 
		{
			return "";
		}
		for (int i=0; i<strs.length; i++)
		{
			if (min_length>strs[i].length()) min_length = strs[i].length();
		}
		StringBuffer result = new StringBuffer();
		boolean common = true;
		for (int j=0; j<min_length; j++)
		{
			common = true;
			char c = strs[0].charAt(j);
			for (int k=1; k<strs.length; k++)
			{
				if(c!=strs[k].charAt(j)) 
				{
					common = false;
					break;
				}
			}
			if(common) result.append(c);
		}
		return (result.toString().length()!=0)? result.toString(): "";
	}
	public static void main(String[] args)
	{
		String[] input= new String[] {"flower","flow","flight"};
		System.out.println(common_prefix(input));
	}
}
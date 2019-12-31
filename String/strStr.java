/* 
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
*/
public class strStr{
	public static int subString(String haystack, String needle)
	{
		if (needle.length()==0) return 0;
        else if (needle.length()==1 && haystack.length()==0) return -1;
        int j =0;
        int index =-1;
        for (int i=0; i<haystack.length(); i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if (index==-1) index = i;
                while(j<needle.length() && i+j <haystack.length())
                {
                    if(haystack.charAt(i+j)!=needle.charAt(j))
                    {
                        j=0;
                        index = -1;
                        break;
                    }
                    else 
                    {
                        j++;
                    }
                }
            }
        }
        return (j==needle.length())? index: -1;
    }
	public static void main(String[] args)
	{
		String haystack = "hello", needle = "ll";
		String haystack_2 = "aaaaa", needle_2 = "bba";
		System.out.println(subString(haystack, needle));
		System.out.println(subString(haystack_2,needle_2));
	}
}
/*Cuong Phan
Multiple missing elements in an unsorted array  */
import java.util.Vector;
public class MultipleMissingElements {
static class Pair {
	int min;
	int max;
}
	//Create an extra array just like a Hash Table to store 0/1 an decides missing elements
	//Take O(n) time and space
	public static Vector<Integer> FindMissingElements(int[] input_array)
	{
		Vector<Integer> V = new Vector<Integer>();
		Pair min_max = new Pair();
		min_max = getMinMax(input_array);
		//Create a new 1-D Hash Table
		int [] Hash_Table = new int[min_max.max+1];
		for (int i=0; i<Hash_Table.length; i++)
		{
			Hash_Table[i] = 0;
		} 
		//Mark 1 to where there is elements in the input array
		for (int j =0; j<input_array.length; j++)
		{
			Hash_Table[input_array[j]] = 1;
		}
		int k =min_max.min;
		while (k<Hash_Table.length)
		{
			if (Hash_Table[k] == 0)
			{
				V.addElement(k);
			}
			k++;
		}
		return V;
	}
	//Compare in pair to minimize # of comparisons => take O(n)
	public static Pair getMinMax(int[] input_array)
	{
		Pair min_max = new Pair();
		int i;
		//Length of array is odd
		if (input_array.length%2!=0)
		{
			min_max.min = input_array[0];
			min_max.max = input_array[0];
			i = 1;
		}
		//Length of array is even
		else 
		{
			if (input_array[0] > input_array[1])
			{
				min_max.max = input_array[0];
				min_max.min = input_array[1];
			}
			else 
			{
				min_max.min = input_array[0];
				min_max.max = input_array[1];
			}
			i=2;
		}
		while (i<input_array.length-1)
		{
			if (input_array[i] > input_array[i+1])
			{
				if (input_array[i]> min_max.max)
				{
					min_max.max = input_array[i];
				}
				if (input_array[i+1] < min_max.min)
				{
					min_max.min = input_array[i+1];
				}
			}
			else 
			{
				if (input_array[i+1]> min_max.max)
				{
					min_max.max = input_array[i+1];
				}
				if (input_array[i] < min_max.min)
				{
					min_max.min = input_array[i];
				}
			}
			i = i+2;
		}
		return min_max;
	}
	public static void main(String[] args)
	{
		int[] array = new int[]{4,8,3,5,6,7,10,12};
		Vector <Integer> V = new Vector <Integer>();
		V = FindMissingElements(array);
		System.out.println(V);
	}
}
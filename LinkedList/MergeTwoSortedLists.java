/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4 */

/* ===================
Cuong Phan
This solution take O(length_of_l1 + length_of_l2) time 
and don't take any extra space
======================*/
public class MergeTwoSortedLists {
	//Definition of singly linked list node
	static class ListNode {
		int data;
		ListNode next;
		ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	//Traversing through node from head node to print all elements
	public static void Print(ListNode head)
	{
		if(head==null)
			return;
		while(head!=null)
		{
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	//create a linked list from an input array
	public static ListNode createList(int[] array)
	{
		//Create a headnode
		ListNode l = new ListNode(array[0]);
		ListNode head = l;
		for (int i=1; i<array.length; i++)
		{
			l.next = new ListNode(array[i]);
			l = l.next;
		}
		return head;
	}
	//Merge two sorted list into a sorted list
	public static ListNode mergeList(ListNode l1, ListNode l2)
	{
		ListNode head = null;
		ListNode tail = null;
		if (l1.data<=l2.data)
		{
			head = l1;
			tail = l1;
			l1 = l1.next;		
		}
		else 
		{
			head = l2;
			tail = l2;
			l2 = l2.next;
		}
		//Traversing compare and append node to the new merged list
		while(l1!=null && l2!=null)
		{
			if(l1.data<=l2.data)
			{
				tail.next = l1;
				tail = l1;
				l1 = l1.next; 
			}
			else 
			{
				tail.next = l2;
				tail =l2;
				l2 = l2.next;
			}
		}
		//Append any remaining nodes to the list
		while(l1!=null || l2!=null)
		{
			if(l1!=null)
			{
				tail.next = l1;
				tail = l1;
				l1 = l1.next;
			}
			else if (l2!=null)
			{
				tail.next = l2;
				tail = l2;
				l2 = l2.next;
			}
		}
		return head;
	}
	public static void main(String[] args)
	{
		int[] array1 = new int[]{1,2,4,7,10};
		int[] array2 = new int[]{1,3,4,8,9};
		ListNode l1 = createList(array1);
		ListNode l2 = createList(array2);
		Print(l1);
		Print(l2);
		Print(mergeList(l1,l2));
	}
}

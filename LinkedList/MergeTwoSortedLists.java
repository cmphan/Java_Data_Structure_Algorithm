/*Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4 */

/* ===================
Cuong Phan
This solution take O(max(length_of_l1, length_of_l2)) time 
and O(length_of_l1 + length_of_l2) space 
======================*/
public class MergeTwoSortedLists {
	static class LinkedList {
		ListNode head;
		static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {this.val = x; next = null;}
		}
	}
// 	public static int ListNode mergeTwoLists(ListNode l1, ListNode l2)
// 	{
// 		
// 	}
	public static LinkedList append(LinkedList list, int x)
	{
		ListNode new_node = new ListNode(x);
		if(list.head==null)
		{
			list.head = new_node;
		}
		else 
		{
			ListNode last = list.head;
			while (last.next!=null)
			{
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	public static void print(LinkedList list)
	{
		ListNode last = list.head;
		while(last!=null)
		{
			System.out.println(last.val);
			last = last.next;
		}
	}
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list = list.append(list,1);
		list.print(list);
	}
}
/* Linked List Basic Operations in java
Cuong Phan 
*/
public class LinkedList {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	//Insert a new node at the end of the list
	public static LinkedList append(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		//If the list is empty -> make new node the head node
		if (list.head==null)
		{
			list.head = new_node;
		}
		//If the list has element -> traverse to the end of the list
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	//Insert a new node at a given index
	public static LinkedList Insert(LinkedList list, int data, int index)
	{
		Node new_node = new Node(data);
		//Insert at the front
		if (index==0)
		{
			new_node.next = list.head;
			list.head = new_node;
		}
		//Traversing to the position needs to be inserted
		else 
		{
			Node current_node = list.head;
			try {
			while(current_node.next!=null && index-1>0)
			{
				current_node = current_node.next;
				index--;
			}
			new_node.next = current_node.next;
			current_node.next = new_node; }
			catch (Exception e)
			{
				System.out.println("Error.Index out of range");
			}
		} 
		return list;
	}
	//Delete an element at a given index
	public static LinkedList Delete(LinkedList list, int index)
	{
		//Delete at the front
		if(index==0)
		{
			list.head = list.head.next;
		}
		//Traversing to the given index
		else
		{
			Node current_node = list.head;
			try 
			{
				while (current_node.next!=null && index-1>0)
				{
					current_node = current_node.next;
					index--;
				}
				//Delete at the end
				if(current_node.next.next==null)
				{
					current_node.next = null;
				}

				else 
				{
					current_node.next = current_node.next.next;
				}
			}
			catch(Exception e) 
			{
				System.out.println("Error. Index out of range");
			}
		}
		return list;
	}
	//Search for a key in a linked list and return the index position
	public static int SearchForKey(LinkedList list, int key)
	{
		Node current_node = list.head;
		int index =0;
		while(current_node!=null)
		{
			if (current_node.data==key) return index;
			current_node = current_node.next;
			index++;
		}
		return -1;
	}
	//Print all elements in the linked list
	public static void Print(LinkedList list)
	{
		//If the list is empty
		if (list.head==null)
		{
			System.out.println("Error. The list is empty");
		}
		else 
		{
			Node current_node = list.head;
			while(current_node!=null)
			{
				System.out.println(current_node.data + " ");
				current_node = current_node.next;
			}
		}
	}
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list = list.append(list,2);
		list = list.append(list,3);
		list = list.append(list,4);
		list = list.Insert(list,5,2);
		list = list.Delete(list,2);
		int key =4;
		if(list.SearchForKey(list,key)!=-1)
		{
			System.out.println(key + " is found at index " + list.SearchForKey(list,key));
		}
		else 
		{
			System.out.println(key + "is not found in the list");
		}
		Print(list);
	}
}
/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Partition {

	/**
	 * @param args
	 */
	/*
	 * Partition : write a code to partition a linked list around a value x, such that all nodes less than x
	 * come before all nodes greater than or equal to x.If x is contained within the list, the values of x only
	 * need to be after the elements less than x.The partition element x can appear anywhere in the "right partition"
	 * it does not need to appear between the left and right partitions.
	 * 
	 * Example:
	 *  
	 * Input : 3 --> 5 --> 8 --> 5 --> 10 --> 2 --> 1 (partition = 5)
	 * 
	 * Output : 3 --> 1 --> 2 --> 10 --> 5 --> 5 --> 8
	 * 
	 *     (   nodes <= x  >= node )
	 * 
	 * 
	 * 
	 */
	static class Node{
		
		Node next;
		int data;
		public Node(int data){
			this.next = null;
			this.data = data;
		}
	}
	
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Partition list = new Partition();
		 
		list.head = new Node(3);
		list.head.next = new Node(5);
		list.head.next.next = new Node(8);
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.next = new Node(10);
		list.head.next.next.next.next.next = new Node(2);
		list.head.next.next.next.next.next.next = new Node(1);
		int x = 5;
		partition(head,x);
		printList(head);
		
	}
	static void printList(Node head){
		
		Node n = head;
		while(n != null){
			n = n.next;
		}
	}
	static void partition(Node node,int x){
		Node head = node;
		Node tail = node;
		while(node != null){
			Node next = node.next;
			System.out.print(next.data+" ");
			if(node.data < x){
				node.next = head;
				head = node;
			}else{
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
	}
}

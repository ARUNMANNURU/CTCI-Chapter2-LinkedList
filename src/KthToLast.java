/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class KthToLast {

	/**
	 * @param args
	 */
	/*
	 * 
	 * 
	 * Implement algorithm to find kth to last element of singley linkedlist
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

		KthToLast listElements = new KthToLast();
		
		listElements.head = new Node(3);
		listElements.head.next = new Node(2);
		listElements.head.next.next = new Node(3);
		listElements.head.next.next.next = new Node(0);
		int key = 2;
		printElements(head,key);
		
	}
	
	/*
	 * This function will calculates the total length of list and subtract the kth index
	 * 
	 * So that the value return should be the kth to last element
	 * 
	 * kth element  = (size of list - kth element)
	 * 
	 * 
	 */
	
	static void printElements(Node head,int key){
		
		Node n = head;
		int length = 0;
		while(n != null){
			++length;
			System.out.println(n.data+" ");
			n = n.next;
		}	
		System.out.println("length of linkedlist"+" "+length);
		kthElement(head,key,length);
	}
	static void kthElement(Node head,int key, int length){
		
		int index = length - key;
		int count = 1;
		Node n = head;
		
		while(n != null){
			++count;
			if(count == index){
				System.out.println("Kth Element is : -->"+n.data);
			}
			n = n.next;
		}	
	}
}

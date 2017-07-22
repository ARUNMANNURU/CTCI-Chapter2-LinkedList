/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class LoopDetection {

	/**
	 * @param args
	 */
	/*
	 * Given a circular linked list, implement an algorithm that returns the node at the begining of the loop
	 * 
	 * Definition : Circular linkedList A linkedlist in which a node's next pointer points to an earlier node
	 * so as to make a loop in linkedlist
	 * 
	 * Example:
	 * 
	 * input : a --> b --> c --> d --> e --> c (the same as C as earlier)
	 * 
	 * output : C
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
		
		LoopDetection listEle = new LoopDetection();
		listEle.head = new Node(1);
		listEle.head.next = new Node(2);
		listEle.head.next.next = new Node(3);
		listEle.head.next.next.next = new Node(4);
		listEle.head.next.next.next.next = new Node(5);
		listEle.head.next.next.next.next.next = new Node(9);
		printEle(head);
		loopDetection(head);
		
	}
	static void printEle(Node head){
		Node n = head;
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	static void loopDetection(Node head){	
		Node ptr1 = head ,ptr2 = head;
		while(ptr1 != null && ptr2 != null && ptr2.next != null){
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
			if(ptr1 == ptr2)
				System.out.println(ptr1.data+" ");
		}
		System.out.println("No loop detected");
	}

}

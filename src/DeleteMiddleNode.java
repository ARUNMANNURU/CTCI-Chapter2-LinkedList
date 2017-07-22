/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class DeleteMiddleNode {

	/**
	 * @param args
	 */
	/*
	 * Delete Middle node in linked list : Implement algorithm to delete middle node in linked list of singly linke list
	 * given only access to that node.
	 * (any node but the first and last node not necessarily the exact middle)
	 * 
	 * E:..--> Input : the node of c from the linked list a -> b -> c -> d -> e -> f
	 *         Output: nothing returned, but the new linked list looks like a -> b -> d -> e -> f
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
		
		DeleteMiddleNode deleteNode = new DeleteMiddleNode();
		deleteNode.head = new Node(1);
		deleteNode.head.next = new Node(2);
		deleteNode.head.next.next = new Node(3);
		deleteNode.head.next.next.next = new Node(4);
		deleteNode.head.next.next.next.next = new Node(5);
		deleteNode.head.next.next.next.next.next = new Node(6);
		int key = 3;
		deleteNthNode(head,key);
		printList(head,key);
	}
	static void printList(Node head,int key){
		Node n = head;
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	static void deleteNthNode(Node head,int key){
		Node n = head;
		while(n != null){
			if(n.data == key){
				n = n.next;
			}
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
}

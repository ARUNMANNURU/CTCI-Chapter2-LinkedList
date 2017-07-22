/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	/*
	 * 
	 * Implement algorithm or function to check if a linked list is a palindrom 
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

		Palindrome list = new Palindrome();
		list.head = new Node(1);
		list.head.next = new Node(1);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(1);
		list.head.next.next.next.next = new Node(1);
		System.out.println(isPalindrom(head));
		printList(head);
	}
	static void printList(Node head){	
		Node n = head;
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next; 
		}
	}
	static boolean isPalindrom(Node head){
		Node reversed;
		reversed = reverseList(head);
		return isEqual(head,reversed);
	}
	static Node reverseList(Node head){
		Node n = head;
		while(n != null){
			n = new Node(n.data);
			n.next = head;
			head = n;
			head = head.next;
		}
		return head;
	}
	static boolean isEqual(Node one ,Node two){
		
		while(one != null && two != null){
			if(one.data != two.data){
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}
}

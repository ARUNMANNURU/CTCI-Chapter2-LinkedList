/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class RemoveDups {

	/**
	 * @param args
	 */
	/*
	 * Write a code to remove dups from unsorted linkedlist
	 * 
	 * Follow-up:
	 * 
	 * How would you solve this problem if a temporary buffer is not allowed:
	 * 
	 * 
	 */
	static class Node{
		
		Node next;
		int data;
		public Node(int data){
			this.next = next;
			this.data = data;
		}
	}
	
	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDups removeDup = new RemoveDups();
		
		removeDup.head = new Node(1);
		removeDup.head.next = new Node(1);
		removeDup.head.next.next = new Node(3);
		removeDupEle();
		printList(head);
	}
	static void printList(Node head){
		
		Node n = head;
		while( n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}	
	}
	static void removeDupEle(){
		
		Node ptr1=null,ptr2=null,dups=null;
		ptr1 = head;
		if(ptr1 != null && ptr1.next != null)
			ptr2 = ptr1;
		while(ptr1 != null && ptr2.next != null){
			if(ptr1.data == ptr2.next.data){
				dups = ptr2.next;
				 ptr2.next = ptr2.next.next;
                 System.gc();
			}else{
				ptr2 = ptr2.next;
			}
		}
		ptr1 = ptr1.next;
	}
}
public class ReverseLinkedList { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to reverse the linked list */
    Node reverse(Node node) 
    { 
        Node current = node;
        Node previous = null;
        
        do{
           Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }while(current != null);
        
        return previous;
    } 
  
    // prints content of double linked list 
    void printList(Node node) 
    { 
        Node tnode = node; 
		while (tnode != null) 
		{ 
			System.out.print(tnode.data+" "); 
			tnode = tnode.next; 
		}  
    } 
  
    public static void main(String[] args) 
    { 
        ReverseLinkedList list = new ReverseLinkedList(); 
        list.head = new Node(1); 
        list.head.next = new Node(2); 
        list.head.next.next = new Node(3); 
        list.head.next.next.next = new Node(4); 
  
        System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
} 
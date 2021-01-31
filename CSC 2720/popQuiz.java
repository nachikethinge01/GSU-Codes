import java.util.List;

public class Node{ //Class Node
    int item;
    Node next;

    Node(int d){ //Constructs a node
        item = d;
        next = null;
    }
}

public class popQuiz{
    public static void main(String[] args){
        System.out.println("Pop Quiz Programming: ``");
        Node head = new Node(1); //Assigns the head of the List
        head.next=new Node(2); //Assigns the second value to the List
        head.next.next=new Node(3);  //Assigns the third value to the List
        head.next.next.next=new Node(1); //Assigns the forth value to the List (Duplicate!)
        head.next.next.next.next=new Node(2); //Assigns the fifth value to the List (Duplicate!)
        head = getUnique(head); //Calls the method get Unique values in the List
        printLinkedList(head); //Calls the method to print the List

    }

    public static Node getUnique(Node head){ //Method to get only unique values in a list
        Node temp1 = head; //Creates a temp variable and assigns it to the passed value
        Node temp2 = null; //Creates another temp variable and assigns it to null

        while(temp1 != null && temp1.next != null){ //Makes sure if the passed value and the value following it is not null
            temp2 = temp1; //Assigns the temp1 variable to the temp2 variable
            while(temp2 != null && temp2.next != null){ //Makes sure if the current node and the one following it is not null
                if(temp1.item == temp2.next.item){ //Checks if the values are duplicate (If it is already in the list)
                    temp2.next = temp2.next.next; //Assings the next value to the one follwing it (Deleting the value)
                }else{
                    temp2 = temp2.next; //Assigns the current value to the next (Not Deleting the value)
                }
            }
            temp1 = temp1.next; //Iterates
        }
        return head; //returns only unique values of the list
    }

    public static void printLinkedList(Node head){ // Method to print the list
        for(Node cur = head; cur != null; cur = cur.next){ //For loop to iterate through the list
            System.out.print(cur.item + ""); //Prints the data of the node
        }
        System.out.println(); //Adds the new line
    }
}


import java.util.*;
import java.io.*;

public class LinkedList {
    static class Node{
        int data; 
        Node next; //Node variable to store values

        public Node(int data){ //Constructs the new node
            this.data = data; //Assigns the passed value to data
            this.next = null; //Sets the next node to null
        }
    }

    public Node head = null;

    public void add(int num){
        Node temp = new Node(num); //Creates a new node temp

        temp.next = head; //Assigns the head variable to the next node of temp

        head = temp; //Assigns the temp num passed to head as new elements are added from head
    }

    public void deleteHead(){
        int num = 0; //variable to take the 0th field of the list
        int i = 0; //Iterator variable
        if(head == null){ //Returns nothing if there is nothing to delete in the list
            return;
        }
        Node temp = head; //Assigns the head varaible to temp for getting deleted

        if(num == 0){ 
            head = temp.next; //if the variable num is 0 then the head variable will be the next variabel
            return;
        }

        while(temp != null && i < num - 1){ //Assigns the next variable to temp if the temp is not null and i is less than num 
            temp = temp.next;
            i++; //Increments the Iterator
        }

        if(temp == null || temp.next == null) //returns nothing if temp is null
            return;
        
        Node next = temp.next.next; //Shifts the nodes to the left
        temp.next = next; //Shifts the nodes to the left
    }

    public void print(){ //Prints the list
        Node temp = head; //Assigns the head of the list to temp variable
        while(temp != null){
            System.out.print(temp.data + " ");  //Prints out the number assigned to each node
            temp = temp.next; //Iterates through the list
        }
        System.out.println();
    }

    public void printHead(){ //Prints the first element in the list
        System.out.println(head.data);
    }

    public static void main(String[] args){


        LinkedList list = new LinkedList(); 

        list.add(1); //Adds the number 1 to the list
        list.add(2); //Adds the number 2 to the list
        list.add(3); //Adds the number 3 to the list
        list.add(4); //Adds the number 4 to the list
        list.add(5); //Adds the number 5 to the list

        System.out.print("The List is: ");
        list.print(); //Prints the list

        System.out.print("The head element of this list is: ");
        list.printHead(); //Prints the head of the list

        list.deleteHead(); //Deletes the head of the list

        System.out.print("The List after deleting head is: ");
        list.print(); //Prints the list after deleting

        System.out.print("The New head is: ");
        list.printHead(); //Prints the new head after deleting the previous head


        //Time complexity is 1.5ms
        //Space Complexity is 1.8mb
    
    }


}

import java.util.*;
import java.io.*;

public class RingBufferMain {
    public static void main(String[] args){

        RingBuffer arr = new RingBuffer(5); //Creates a Ringbuffer array with the length of 5
        arr.add(1); //Adds the number 1 to the array
        arr.add(2); //Adds the number 2 to the array
        arr.add(3); //Adds the number 3 to the array
        arr.add(4); //Adds the number 4 to the array
        arr.printBuffer(); //Prints the array
        System.out.println("Deleted Value = " + arr.delete()); //Deletes the first element and prints the the deleted number
        System.out.println("Deleted Value = " + arr.delete()); //Deletes the first element and prints the the deleted number
        arr.printBuffer(); //Prints the array
        arr.add(9); //Adds the number 9 to the array
        arr.add(20); //Adds the number 20 to the array
        arr.add(5); //Adds the number 5 to the array
        arr.printBuffer(); //Prints the array
        arr.add(100); //Adds the number 100 to the array. This will give the error Buffer is full

        
        //Time Complexity is 1ms
        //Space Complexity is 1.8mb
      
    }
}
 
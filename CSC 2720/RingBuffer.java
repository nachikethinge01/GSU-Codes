import java.util.*;

public class RingBuffer {
    static int[] buffer; //Creates an array called buffer
    private static int length; //Tracks the length of the array
    private static int front; //Tracks what element is first
    private static int rear; //Tracks what element is last
    private static int currentSize; //Tracks the current size of the array excluding -1s

    public RingBuffer(int length) {
        this.length = length; //Sets the length of array to the passed value
        buffer = new int[length]; //creates an array of length items
        fill(); //fills the array with -1s 
        front = -1; //Sets front to -1 as no element has been added
        rear = -1; //Sets rear to -1 as no element has been added
        currentSize = 0; //Sets the current size of the arry to 0 as no element has been added
    }

    public void add(int element){ //Adds the passed value to the array if possible
        if (currentSize == length) {
            System.out.println("Buffer is full!"); //Prints if the Buffer is full by checking if the size is equal to the length
        } else {
            rear = (rear + 1) % length; //Points the rear to the position where the element should be added
            buffer[rear] = element; //Adds the element to rear position of array
            currentSize++; //Increments the size as a new element has been added
            if (front == -1) 
                front = rear; //If this element is the first element to be added then sets front to the rear position
        }
    }

    public int delete(){ //Deletes the first element in the array
        int temp = 0; //Creates a new variable called temp
        if(buffer[front] == -1){ 
            System.out.println("Buffer is Empty!"); //Checks if the front element is -1 and prints it is empty
        }else{
            temp = buffer[front]; //Assigns temp variable to the first element to be deleted
            if(front == rear){ //If there is just one element then deletes that element and sets the first element to -1 
                front = -1; 
                rear = -1;
                buffer[0] = -1;
            }else if(front == length - 1){ //If there is no elements then does nothing and sets front to 0
                front = 0;
            }else{ //Else rotates the array to left and sets the last element to -1
                for(int i = 0; i < buffer.length-1; i++){
                buffer[i] = buffer[i+1]; //Sets the next element to the pointer
                }
            }
            buffer[length-1] = -1; //Sets the last element to -1
            currentSize--; //Deincrements the size
            rear--; //Deincrements the rear position
        }
        return temp; //Returns the deleted item
    }

    public void printBuffer(){
        if(front == -1){ //Checks if there are no elements in the array
            System.out.println("Buffer is Empty!"); //Prints if the array is empty
        }else{
            System.out.print("The elements in Ring Buffer are: "); //Prints the elements in the array
            for(int i = front; i <= rear; i++){ //Starts from front and ends at rear by not printing the -1s at the end
                System.out.print(buffer[i] + " ");
            }
            System.out.println(); //Adds a new line
        }
    }

    public void fill(){ //Adds -1s to the array
        for(int i = 0; i < buffer.length; i++){
            buffer[i] = -1;
        }
    }





}

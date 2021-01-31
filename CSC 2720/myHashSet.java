/*
Name: Nachiket Hinge
*/

import java.util.List; //Imports List class
import java.util.ArrayList; //Imports ArrayList Class

class MyHashSet { //Class to create a hashset without using hashset library
    List<Integer>[] hashSet; //Global variable for saving the hashset in a list


    public int getPos(int key, int index) { //Method to get the position in the list of the given key and index
        List<Integer> pos = hashSet[index]; //Creates a temp list 
        int res = -1; //Saves the position
        if (pos == null) { //Checks if the position does not exist
            return res; //returns -1 if the condition is true
        }
        int size = pos.size(); //Saves the size of the list
        for (int i = 0; i < size; ++i) { //Iterates through the list to find the key
            if (pos.get(i) == key) { //Checks if pointing at the key
                res = i; //Saves the position to the variable
                break; //breaks if found
            }
        }
        return res; //retusn the position
    }

    public int getIndex(int key) { //Method to get the index of the passed key
        return key % 100; //Does modules of the key with the size of arraylist. NOTE: Assuming the size is 100
    }

   

    public MyHashSet() {
        hashSet = (List<Integer>[]) new ArrayList[100]; //Creates a new array list and casts it as a list to serve the purpose of the program
    }

    public void add(int key) { //Method to add a value in the hashset
        int index = getIndex(key); //Gets the index 
        int pos = getPos(key, index); //Gets the position of where to store the key
        if (pos < 0) { //Checks if the position does not exists
            if (hashSet[index] == null) { //Checks if the set is null
                hashSet[index] = new ArrayList<Integer>(); //If it is null creates a arraylist
            }
            hashSet[index].add(key); //Otherwise adds the key to the set
        }
    }

    public void contains(int key) { //Method to check if the key is in the set
        int index = getIndex(key); //Gets the index
        int pos = getPos(key, index); //Gets the position
        if(pos >= 0){ //Checks if the position exists
            System.out.println(key); //Prints the integer 
        }else{
            System.out.println("Hey Nothing there"); //Otherwise prints the key does not exists
        }
    }

    public void remove(int key) { //Method to remove the passed key
        int index = getIndex(key); //Gets the index
        int pos = getPos(key, index); //Gets the position of where to remove the key
        if (pos >= 0) { //Checks if the position exists in the set
            hashSet[index].remove(pos); //removes the position where the key was stored
        }else{
            System.out.println("Hey value does not exist at all"); //Otherwise prints that the key does not exists
        }
    }

    public static void main(String[] args) { //Main Method
        long startime = System.nanoTime();
        MyHashSet hashSet = new MyHashSet(); //Intializes the hashset
        hashSet.add(1); //Adds 1. Set = 1
        hashSet.add(2); //Adds 2. Set = 1, 2
        hashSet.add(10); //Adds 10. Set = 1, 2, 10
        hashSet.remove(2); //Removes 2. Set = 1, 10
        hashSet.contains(1); //Checks if the set contains 1. Should return 1
        hashSet.add(3); //Adds 3. Set = 1, 10, 3
        hashSet.contains(2); //Checks if the set contains 2. Should print "Hey Nothing there".
        hashSet.remove(5); //Removes 5. Set = 1, 10, 3. Should print "Hey value does not exist at all"
        long endtime = System.nanoTime();
        System.out.println("Time taken to run the code: " + (endtime - startime) + " ms");

        /* OUTUT: 
            1
            Hey Nothing there
            Hey value does not exists at all
        */
    }
}
 
//Time Complexity: O(n^2)
//Space Complexity: O(n^2)

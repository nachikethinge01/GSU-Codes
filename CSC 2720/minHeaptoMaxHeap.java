/*
Name: Nachiket Hinge
*/

import java.util.Arrays; //Imports Arrays class

class minHeaptoMaxHeap { //Class to convert Minimum Heap to Maximum Heap
	static void toMax(int arr[], int i, int size) { //Method to heapify the subtree where the root is been passed
		int right = 2 * i + 2; //A right node variable
		int left = 2 * i + 1; //A Left node variable
		int largest = i; //Variable to store the largest value of those two variables

		if (left < size && arr[left] > arr[i]) { //Check if the left sub node is less than size and if it is greater than arr[i]
			largest = left; //Saves the integer
		}
		if (right < size && arr[right] > arr[largest]) { //Check if the right sub node is less than size and if it is greater than arr[i]
			largest = right; //Saves the integer
		}
		if (largest != i) { //If largest value was not the same as the passed value (most cases!), swap those values
			int temp = arr[i]; //Saves the arr[i] variable in temp variable
			arr[i] = arr[largest]; //swaps the arr[largest] with arr[i]
			arr[largest] = temp; //transfers back the temp variable to arr[largest]
			toMax(arr, largest, size); //recursive method to call it once again to go further in the heap
		}
	}

	static void convert(int arr[], int size) { //Method called from main method to pass the subtree 
		if (size < 1) { //Checks if the size is less than 1
			System.out.println("Empty Array"); //Prints "Empty Array" if the condition is true 
		} else { 
			int i = (size - 2) / 2; //Starting variable to start from the one side of the heap
			while (i >= 0) { //While loop to pass variable i and go further in the heap
				toMax(arr, i, size); //Calls the function to heapify the subtree passed
				i--; //Decrements the value i
			}
		}
	}

	public static void main(String[] args) { //Main Method

		/* ----------TEST CASE 1----------*/
		int arr[] = { 3, 5, 9, 6, 8, 20, 10, 12, 18, 9 }; //Initializing array

		System.out.print("Min Heap array : "); //Printing the orginal array
		System.out.println(Arrays.toString(arr)); //Printing the orginal array by converting the array to string

		convert(arr, arr.length); //Calls the method to convert the minimum heap to maximum heap
		System.out.print("Max Heap array : "); //Printing the converted array 
		System.out.println(Arrays.toString(arr)); //Printing the converted array by converting the array to string
		System.out.println("");

		/* ----------TEST CASE 2----------*/
		int arr2[] = {1, 2};
		System.out.print("Min Heap array : "); //Printing the orginal array
		System.out.println(Arrays.toString(arr2)); //Printing the orginal array by converting the array to string

		convert(arr2, arr2.length); //Calls the method to convert the minimum heap to maximum heap
		System.out.print("Max Heap array : "); //Printing the converted array 
		System.out.println(Arrays.toString(arr2)); //Printing the converted array by converting the array to string
		System.out.println("");

		/* ----------TEST CASE 3----------*/
		int arr3[] = {0, 1, 2, 3, 4, 5, 6};
		System.out.print("Min Heap array : "); //Printing the orginal array
		System.out.println(Arrays.toString(arr3)); //Printing the orginal array by converting the array to string

		convert(arr3, arr3.length); //Calls the method to convert the minimum heap to maximum heap
		System.out.print("Max Heap array : "); //Printing the converted array 
		System.out.println(Arrays.toString(arr3)); //Printing the converted array by converting the array to string
		System.out.println("");
	}
}

//Time Complexity: O(n^2)
//Space Complexity: O(n^2)
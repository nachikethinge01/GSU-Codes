//Using Counting sort as this is the most effective for the input

import java.util.Arrays;
import java.util.*;

public class Lab11 {
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 0, 1, 2};
        System.out.println("Original Array: " + Arrays.toString(arr));
        countingSort(arr, 0, 2);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArr = new int[(max - min) + 1];
        for(int i = 0; i < input.length; i++){
            countArr[input[i] - min]++;
        }

        int j = 0; 
        for(int i = min; i <= max; i++){
            while(countArr[i - min] > 0){
                input[j] = i;
                countArr[i - min]--;
                j++;
            }
        }
    }
}
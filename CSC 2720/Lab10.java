import java.util.Arrays;
import java.util.Hash;
import java.util.*;

public class Lab10 {

    public static void main(String []args){

        int[] arr = {1, 5, 3, 4, 2};

        int k = 3;

        long start = System.currentTimeMillis();

        System.out.println("Count is "+ solve_with_Hash(arr,k)); // should be 2 
        System.out.println("Total execustion time (taken by solve_with_Hash): " + (System.currentTimeMillis()-start));


        start = System.currentTimeMillis();

        System.out.println("\n\nCount is "+ solve_with_Sort(arr,k)); // should be 2 
        System.out.println("Total execustion time (taken by solve_with_Sort): " + (System.currentTimeMillis()-start));

    }


    public static int solve_with_Sort(int[] arr, int k){ 
        int counter = 0;
        Arrays.sort(arr);
        int left = 0, right = 0;
        while(right < arr.length){
            int diff = arr[right] - arr[left];
            if(diff == k){
                counter++;
                left++;
                right++;
            }else if(diff > k){
                left++;
            }else{
                right++;
            }
        }
        return counter;
    }



    public static int solve_with_Hash(int[] arr, int k){ 
        int counter = 0;
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            hash.add(key);
        }
        for(int i = 0; i < arr.length; i++){
            if(hash.contains(arr[i] + k) || hash.contains(arr[i] - k)){
                counter++;
                hash.remove(arr[i]);
            }
        }
        return counter;
    }

}

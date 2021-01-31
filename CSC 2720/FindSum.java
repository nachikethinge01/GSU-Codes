import java.util.HashSet;

public class FindSum {
    public static void main(String args[]){
        int[] arr = { 1, 5, 4, 6, 7, 9 }; 
        HashSet<Integer> res = findSums(arr); 
        System.out.println(res.toString()); // Should return [6,5,7,9]   
    }

    public static HashSet<Integer> findSums(int[] elements){
        HashSet<Integer> sums = new HashSet<Integer>();
        HashSet<Integer> hashtable = new HashSet<Integer>();

        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                if(!hashtable.contains(elements[j])){
                    hashtable.add(elements[j]);
                }
                int sum = elements[i] + elements[j];
                if(hashtable.contains(sum)){
                    sums.add(sum);
                }
            }
        }
        return sums;
    }


}

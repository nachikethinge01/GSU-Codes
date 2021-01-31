import java.util.ArrayList;

public class Nachiket_Hinge_Problem2 {
    public static void main(String[] args){
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 7, 8};
        ArrayList<Integer>res = new ArrayList<Integer>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    res.add(nums1[i]);
                }
            }
        }
        System.out.println(res);
    }
}
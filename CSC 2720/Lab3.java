import java.util.Stack;
import java.util.Scanner;

public class Lab3{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first String: "); //Takes the first input
        String s1 = scan.next(); 

        System.out.print("Enter the second String: "); //Take the second input
        String s2 = scan.next(); 

        boolean ans = backspaceCompare(s1,s2); //Compares the both strings after the method is executed
        System.out.println(ans); 
    }

    public static boolean backspaceCompare(String s1, String s2){
        Stack<Character> s1_stack = new Stack<Character>();
        Stack<Character> s2_stack = new Stack<Character>();

        char[] s1_array = s1.toCharArray(); //Converts first string to array
        char[] s2_array = s2.toCharArray(); //Converts second string to array

        for(int i = 0; i < s1_array.length; i++){
            char ch = s1_array[i]; //Takes the character by character of first array
            if(ch != '#') 
                s1_stack.push(ch); //Pushes the character to the stack
            else if(!s1_stack.empty())
                s1_stack.pop(); //Removes the character if # is typed
        }

        for(int j = 0; j < s2_array.length; j++){
            char ar = s2.charAt(j); //Takes the character by character of second array
            if(ar != '#')
                s2_stack.push(ar); //Pushes the character to the stack
            else if(!s2_stack.empty())
                s2_stack.pop(); //Removes the cahracter if # is typed
        }

        String res1 = String.valueOf(s1_stack); //Converts the array to String
        String res2 = String.valueOf(s2_stack); //Converts the arry to String
        return res1.equals(res2); //Compares the two strings
    }
}

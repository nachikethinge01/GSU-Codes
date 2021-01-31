import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lab4 {
    public static void main (String[] args){

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a string without any whitespace: "); 
            String s1 = scan.next(); // Takes an input 
            s1 = s1.toLowerCase(); //Converts that input to lowerCase
            boolean ans = checkPalindrome(s1);
            System.out.println(ans); // Should be True
        }

        public static boolean checkPalindrome(String s1){
            Stack<Character> s = new Stack<Character>();
            Queue<Character> q = new LinkedList<Character>();
            String sReverse = ""; 
            String qReverse = "";

            for(int i = 0; i < s1.length(); i++){
                s.push(s1.charAt(i)); //Adds the character to the stack
                q.add(s1.charAt(i)); //Adds the character to the queue
            }
            
            while(!s.empty()){
                sReverse = sReverse + s.pop(); //converts the string backwards using Stack.pop
            }

            while(!q.isEmpty()){
                qReverse = qReverse+q.poll(); //Converts the string backwards using Queue.poll
            }

            return s1.equals(sReverse) && s1.equals(qReverse); //Checks if the string is a palindrome or not
        }
}
import java.util.Stack;

public class Lab2_NachiketHinge {
    public static void main(String[] args){    
        String str = "{}{{{{}}";
        boolean ans = isbalanced(str);
        System.out.println("Answer "+ ans); // Should be False
    }
    
    public static boolean isbalanced(String str){
        Stack<Character> stack = new Stack<Character>();
        // Example of push stack.push("{")
        // Example of pop stack.pop()
        // Example of isEmpty stack.isEmpty()
        for(int i = 0; i < str.length(); i++){
            char bracket = str.charAt(i);
            if(bracket == '{'){
                stack.push(bracket);
            }
            else if(stack.isEmpty()){
                return false;
            }else if(bracket == '}'){
                stack.pop();
            }
        }
        return stack.isEmpty();
        }
}

// To implement a stack that supports getMinimum() in O(1) time and O(1) extra space.
import java.util.Stack;
// A user defined stack that supports getMin() in // addition to push() and pop()
class MyStack
{
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    int min;

    void getMin(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println("The minimum element is : " + minStack.peek());
        }
    }

    void peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            System.out.println("The element at the top of the stack is: " + stack.peek());
        }
    }

    void push(int x){
        stack.push(x);
        if(minStack.size() != 0){
            if(x <= minStack.peek()){
                minStack.push(x);
            }
        }else{
            minStack.push(x);
        }
    }

    void pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty!");
        }else{
            int i = stack.pop();
            if(i == minStack.peek()){
                minStack.pop();
            }
            System.out.println("The element that got popped: " + i);
        }
    }


    public static void main(String[] args) { 
        MyStack s = new MyStack();
        s.push(3); 
        s.push(5); 
        s.getMin(); 
        s.push(2); 
        s.push(1); 
        s.getMin(); 
        s.pop(); 
        s.getMin(); 
        s.pop(); 
        s.peek();
    }
}
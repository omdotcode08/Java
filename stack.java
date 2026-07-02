import java.util.Stack;
public class stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(30);
        stack.push(50);
        stack.push(70);
        stack.push(90);


        while(!stack.empty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println("The Stack is empty!!");
    }
}
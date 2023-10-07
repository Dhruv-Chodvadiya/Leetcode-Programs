import java.util.Stack;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        String s = "()";
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()
        ) {

            if(x=='('){

                stack.push(')');
            } else if (x=='{') {
                stack.push('}');

            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {
                System.out.println("False");
                return;
            }

        }

        System.out.println(stack.isEmpty());
//        return stack.isEmpty();
    }
}

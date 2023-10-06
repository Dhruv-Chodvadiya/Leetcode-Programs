import java.util.Stack;

public class String_Great_1544 {
    public static void main(String[] args) {
        String s = "leEeetcode";
        Stack<Character> stk = new Stack<>();
        for(char ch : s.toCharArray()){
            if(stk.size()>0 && (stk.peek()==ch-32 || stk.peek()==ch+32)){
                stk.pop();
            }
            else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(stk.size()>0){
            char ch = stk.pop();
            sb.append(ch);
        }
//        return sb.reverse().toString();
        System.out.println(sb.reverse());
    }
}

import java.util.Stack;

public class s {
    public static void main(String[] args) {
        // стек
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
    }
}

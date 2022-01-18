package lab6.StackLab6;

import java.util.Stack;

public class BalancedSymbols {
    public static boolean isBalancedExpression(String expression){
        Stack<Character>   stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++){
            char chr = expression.charAt(i);
            char openingSymbol = (chr == ')') ? (char)(chr - 1) : (char)(chr - 2);
            if (chr == '(' || chr == '[' || chr == '{')
                stack.push(chr);
            else if (chr == ')' || chr == ']' || chr == '}'){
                if (stack.isEmpty() || !(stack.peek() == openingSymbol))
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(isBalancedExpression("{[(10 + x) * (3 +x)] * [3x + 2]}"));
    }
}

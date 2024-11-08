package string;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static boolean isBalanced(String s){
        Stack<Character>stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if (a == '{' || a == '[' || a == '(')
                stack.push(a);
            else if (a == '}' || a == ']' || a == ')'){
                if (stack.isEmpty() || !pair(stack.pop(),a))
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static boolean pair(char c1 , char c2){
        if (c1 == '(' && c2 == ')')return true;
        if (c1 == '{' && c2 == '}')return true;
        if (c1 == '[' && c2 == ']')return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        System.out.println(isBalanced((s)));
    }
}

//Problem: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.

//Analysis: Covert string in character array and push it into the stack and match stating and ending
// paranthesis by adding push of stack and if matches do pop of stack for paranthesis.

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s){
        char[] arr = s.toCharArray();
        Stack<Character> set = new Stack<>();
        for(Character ch: arr){
            if(ch == '(' || ch == '{' || ch == '['){
                set.push(ch);
            } else if( ch == ')'){
                if(set.isEmpty() || set.peek() != '(')
                    return false;
                set.pop();
            } else if(ch == '}'){
                if(set.isEmpty() || set.peek() != '{')
                    return false;
                set.pop();
            } else if(ch == ']'){
                if(set.isEmpty() || set.peek() != '[')
                    return false;
                set.pop();
            }
        }
        return set.size() == 0;
    }
}
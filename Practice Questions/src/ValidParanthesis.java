import java.util.*;

public class ValidParanthesis
{
    public static int minBracketsRequiredToMakiValid(String str){
        Stack<Character> stack = new Stack<>();
        char Array[] = str.toCharArray();
        int count = 0;
        int i = 0;
        while ( i < Array.length){
            char c = Array[i];
            if((stack.isEmpty() && isClose(Array[i]))){
                count++;
                i++;
            }else if(isOpen(c)){
                stack.push(c);
                i++;
            }else if(isOpen(stack.peek()) && isClose(c)){
                stack.pop();
                i++;
            }
        }
        return stack.size() + count;
    }

    public static boolean isOpen(char c){
        if(c == '('){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isClose(char c){
        if(c == ')'){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "))))((((";
        System.out.println(minBracketsRequiredToMakiValid(s));
    }
}

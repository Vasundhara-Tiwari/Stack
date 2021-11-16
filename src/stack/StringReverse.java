package stack;

import java.util.Arrays;
import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        String str = "ABCD";
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }
        for(int i=0; i<str.length(); i++){
            chars[i] = stack.pop();
        }
        System.out.println(Arrays.toString(chars));
        str = String.valueOf(chars);
        System.out.println(str);
    }
}

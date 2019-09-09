package LeetCode;
import java.util.*;
public class E20_ValidParantheses {
    public static boolean isValid(String s) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            String pre = Character.toString(s.charAt(i));
            if(pre.equals("(") || pre.equals("{") || pre.equals("[")){
                st.push(pre);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                String popped = st.pop();
                if(popped.equals("(") && pre.equals(")")){
                    continue;
                }
                else if(popped.equals("{") && pre.equals("}")){
                    continue;
                }
                else if(popped.equals("[") && pre.equals("]")){
                    continue;
                } else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}

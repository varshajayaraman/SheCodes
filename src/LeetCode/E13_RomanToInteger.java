package LeetCode;

import java.util.HashMap;

public class E13_RomanToInteger {
    public static int findEquiv(String s){
        int ans = 0;
        HashMap<String,Integer> hMap = new HashMap<>();
        hMap.put("I", 1);
        hMap.put("V", 5);
        hMap.put("X", 10);
        hMap.put("L", 50);
        hMap.put("C", 100);
        hMap.put("D", 500);
        hMap.put("M", 1000);

        for(int i=s.length()-1;i>=0;i--){
            int pre = hMap.get(Character.toString(s.charAt(i)));
            if(pre>=ans){
                ans = pre+ans;
                System.out.println(ans+" "+pre);
            }else {
                if(pre == hMap.get(Character.toString(s.charAt(i+1)))){
                    ans = ans+pre;
                }else {
                    ans = ans - pre;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }
}

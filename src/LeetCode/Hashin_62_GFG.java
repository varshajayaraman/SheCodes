package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Hashin_62_GFG {

    public static void solve(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(Math.negateExact(arr[i]))){
                hm.put(Math.negateExact(arr[i]), arr[i]);
            } else{
                hm.put(arr[i], 0);
            }
        }

        for(Map.Entry<Integer, Integer> en : hm.entrySet()){
            if(en.getValue() != 0){
                System.out.println(en.getKey()+" "+en.getValue());
            }
        }
    }
}

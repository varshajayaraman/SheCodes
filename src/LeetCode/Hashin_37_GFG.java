package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Hashin_37_GFG {

    public static void solve(int[] arr){
        int minMiss = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                while(hm.containsKey(minMiss)){
                    minMiss+= 1;
                }
                hm.put(minMiss, i);
                arr[i] = minMiss;
                minMiss += 1;
            }else{
                hm.put(arr[i], i);
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

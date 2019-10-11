package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Hashing_22_GFG {

    public static void sol(int[] a, int[] b){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            } else{
                hm.put(a[i], 1);
            }
        }

        for(int i=0;i<b.length;i++){
            if(hm.containsKey(b[i])){
                hm.put(b[i], hm.get(b[i])-1);
            }
        }

        for(Map.Entry<Integer, Integer> e: hm.entrySet()){
            if(e.getValue() != 0){
                System.out.println(e.getKey());
            }
        }
    }
}

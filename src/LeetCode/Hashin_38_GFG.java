package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Hashin_38_GFG {

    public static void sol(int[] arr, int sum){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i])+1);
            } else{
                hm.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> en : hm.entrySet()){
            System.out.println(en.getValue());
            System.out.println(sum);
            if(hm.containsKey(sum-en.getKey())){
                if(en.getKey() < (sum-en.getKey())) {
                    System.out.println(en.getKey());
                    count += en.getValue() * hm.get(sum-en.getKey());
                }
                if(en.getKey() == (sum-en.getKey())) {
                    count += factorial((en.getValue())-1);
                }
            }
        }
        System.out.println(count);
    }

    public static int factorial(int a){
        int result=1;
        while(a>0){
            result *= a--;
        }
        return result;
    }
}

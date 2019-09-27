package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Hashing_13_GFG {

    public static void solution(int[] arr, int n){
        Integer s, e;
        s=e=0;
        int maxEle, maxCount;
        maxCount=0;
        maxEle = arr[0];
        HashMap<Integer, Integer[]>  hm = new HashMap<>();

        for(int i=0;i<n; i++){
            if(hm.get(arr[i]) == null){
                Integer[] a = {1, i, i};
                hm.put(arr[i], a);
                if(a[0]>maxCount){
                    maxCount = a[0];
                    maxEle = arr[i];
                }
            } else{
                Integer[] a = hm.get(arr[i]);
                a[0]++;
                a[2] = i;
                hm.put(arr[i], a);
                if(a[0]>maxCount){
                    maxCount = a[0];
                    maxEle = arr[i];
                }
            }
        }
        s = hm.get(maxEle)[1];
        e = hm.get(maxEle)[2]+1;
        int[] x = Arrays.copyOfRange(arr, s, e);
        System.out.println(s+" "+e);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}

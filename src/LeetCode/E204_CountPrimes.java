package LeetCode;

import java.lang.reflect.Array;

public class E204_CountPrimes {
    public static int countPrimes(int n) {
        if(n==1 || n==0){
            return 0;
        }
        int[] arr = new int[n];
        int count = 0;
        for(int i=0;i<n-1;i++){
            arr[i] = i+1;
        }
        arr[0] = -1;
     //   print(arr);
        for(int i=1; i<n-1;i++){
        //    System.out.println(i+" "+arr[i]);
            if(arr[i] == -1 || arr[i] == 1){
                continue;
            }

            int mul = 2;
            int prod = arr[i] * mul;
            while(prod <= n){
                arr[prod-1] = -1;
                mul += 1;
                prod = arr[i]*mul;
            }
        }
        print(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i] != -1){
                count += 1;
            }
        }
        return count;
    }


    public static void print(int[] n){
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}

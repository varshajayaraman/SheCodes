package LeetCode;

public class Minimum_Bribes {

    static void minimumBribes(int[] q) {
        int bribe = 0;
        for(int i=1;i<=q.length;i++){
            if(q[i-1]-i != 0){

                if(q[i-1]>i) {
                    if(q[i-1]-1 > 2){
                        System.out.println("Too chaotic");
                    }else {
                        bribe += q[i - 1] - i;
                    }
                }
            }
        }
        System.out.println(bribe);
    }
}

package LeetCode;

public class Counting_Valleys {

    public static void sol(int n, String s){
        int count=0;
        int sum =0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='D'){
                sum -=1;
            }else{
                sum+=1;
                if(sum==0){
                //    System.out.println(i);
                    count++;
                }
            }
            System.out.println(sum);

        }
        System.out.println(count);
//        return count;
    }
}

package LeetCode;

public class Jumping_On_The_Clouds {

    public static void sol(int[] c){
        int jumps = 0;
        int i=0;
        while(i<c.length-1){
            if((i+2)<c.length){
                if(c[i+2] != 1){
                    i +=2;
                }
                else{
                    i += 1;

                }

            }else{
                i +=1;
            }
        //    System.out.println(i);
            jumps +=1;
        //    System.out.println(jumps);
        }

    }
}

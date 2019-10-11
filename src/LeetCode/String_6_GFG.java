package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class String_6_GFG {

    public static void solve(String st){
        int sum=0;
        ArrayList a;
        for(int i=0;i<st.length();i++){
            if(Character.isDigit(st.charAt(i))){
                a=(ArrayList)(findNumber(st, i, st.length()));
                i = (Integer)(a.get(1));
                sum += (Integer)(a.get(0));
                System.out.println(i +" "+a.get(0));
            }
        }
        System.out.println(sum);
    }

    public static ArrayList findNumber(String st, int i, int l){
        int num=0;
        int j;
        for(j=i;j<l;j++){
            if(Character.isDigit(st.charAt(j))){
                num = (num*10) ;
                num += Character.getNumericValue(st.charAt(j));
            } else{
                break;
            }
        }

        ArrayList<Integer> a = new ArrayList<>();
        a.add(num);
        a.add(j-1);
        return a;
    }
}

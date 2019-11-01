package LeetCode;

public class Repeated_String {
    public static void sol(String s, long n){
        int i=0;
        long count=0;
        while(i<s.length()){
            if(s.charAt(i) == 'a'){
                count++;

            }
            i++;
        }
        long num = (long)Math.floor(n/(long)s.length());
        System.out.println(num);
        count *= num;
        long rem = n%(long)(s.length());
        System.out.println(rem);
        i=0;
        while(i<rem){
            if(s.charAt(i) == 'a'){
                count++;
            }
            i++;
        }
        System.out.println(count);
//        return count;
    }
}

package LeetCode;

public class E9_PalindromeNumber {

    public static boolean findPalindrome(int x){
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        if(x<10){
            return true;
        }

        int rev=0;
        while(x>rev){
            int rem = x%10;
            rev = (rev*10) + rem;
            x=x/10;
        }
        System.out.println(x+" "+rev);
        if(x==rev || x==rev/10){
            return true;
        }
        return false;
    }
}

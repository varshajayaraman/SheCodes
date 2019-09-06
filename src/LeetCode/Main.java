package LeetCode;
import LeetCode.E1_TwoSum;
import LeetCode.E7_ReverseInteger;
import LeetCode.E9_PalindromeNumber;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

//        System.out.println("Two Sums");
//        System.out.println("Please enter length of array:");
//        int length = sc.nextInt();
//        int[] array = new int[length];
//        for(int i=0;i<length;i++){
//            System.out.println("Please enter "+i+"th number:");
//            array[i] = sc.nextInt();
//        }
//        System.out.println("You have entered: "+ Arrays.toString(array));
//        System.out.println("Please enter sum target: ");
//        int target = sc.nextInt();
//        int [] array = {3,3};
//        int target = 6;
//        E1_TwoSum.E1_TwoSum(array, target);


//        System.out.println("Enter num to reverse");
//        int x = sc.nextInt();
//        int x=1534236469;
//        System.out.println(x);
//        int f = E7_ReverseInteger.reverse(x);
//        System.out.println(f);


        int num = 22222;
        boolean ans = E9_PalindromeNumber.findPalindrome(num);
        System.out.println("Ans: "+ans);
    }
}
package LeetCode;
import LeetCode.E1_TwoSum;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("Two Sums");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of array:");
        int length = sc.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Please enter "+i+"th number:");
            array[i] = sc.nextInt();
        }
        System.out.println("You have entered: "+ Arrays.toString(array));
        System.out.println("Please enter sum target: ");
        int target = sc.nextInt();
        E1_TwoSum.E1_TwoSum(array, target);


    }
}
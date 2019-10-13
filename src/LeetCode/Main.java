package LeetCode;
import LeetCode.E1_TwoSum;
import LeetCode.E7_ReverseInteger;
import LeetCode.E9_PalindromeNumber;
import LeetCode.E13_RomanToInteger;
import LeetCode.E14_LongestCommonPrefix;
import LeetCode.E20_ValidParantheses;
import LeetCode.E21_MergeTwoSortedLists;
import LeetCode.ListNode;
import LeetCode.E26_RemoveDuplicatesFromSortedArray;
import LeetCode.E27_RemoveElement;
import LeetCode.E28_ImplementStrStr;
import  LeetCode.E38_CountAndSay;
import LeetCode.E665_NonDecreasingArray;
import LeetCode.E414_ThirdMaximumNumber;
import LeetCode.E859_BuddyStrings;
import LeetCode.E204_CountPrimes;
import LeetCode.E532_KDiffPairsInAnArray;
import LeetCode.E686_RepeatedStringMatch;
import LeetCode.E581_ShortestUnsortedContinuousSubarray;
import LeetCode.RemoveDuplicatesFromSortedArray;
import LeetCode.Hashing_13_GFG;
import LeetCode.Hashin_38_GFG;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.HashMap;
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


//        int num = 22222;
//        boolean ans = E9_PalindromeNumber.findPalindrome(num);
//        System.out.println("Ans: "+ans);

//        String s ="VII";
//        int ans = E13_RomanToInteger.findEquiv(s);
//        System.out.println(ans);

//        String[] r = {"dog", "dog", "dog"};
//        String ans = E14_LongestCommonPrefix.longestCommonPrefix(r);
//        System.out.println(ans);

//        String s="{[]}";
//        Boolean f = E20_ValidParantheses.isValid(s);
//        System.out.println(f);

//        ListNode l1 = new ListNode(1);
//        l1.next = new ListNode(2);
//        //l1 = l1.next;
//        l1.next.next = new ListNode(4);
//
//        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(3);
//        //l2 = l2.next;
//        l2.next.next = new ListNode(4);
//
//        ListNode f = E21_MergeTwoSortedLists.mergeTwoLists(l1, l2);
//        E21_MergeTwoSortedLists.printList(f);
       // System.out.println(f);

//        int [] nums = {};
//        int x = E26_RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
//        System.out.println(x);

//        int[] nums={1};
//        int x = E27_RemoveElement.removeElement(nums, 1);
//        System.out.println(x);

//        String s = "bbbbababbbaabbba";
//        String f = "abb";
//        int x = E28_ImplementStrStr.strStr(s,f);
//        System.out.println(x);

//        int[] nums = {1}; //,3,5,6};
//        int t = -5;
//        System.out.println(E35_SearchInsertPosition.searchInsert(nums, t));


//        System.out.println(E38_CountAndSay.countAndSay(10));

//        int[] nums = {2,3,3,2,4};
//        System.out.println(E665_NonDecreasingArray.checkPossibility(nums));

//        int[] nums = {1,-2147483648, 2};
//        System.out.println(E414_ThirdMaximumNumber.thirdMax(nums));

//        String A = "acb";
//        String B = "abc";
//        System.out.println(E859_BuddyStrings.buddyStrings(A, B));

//        int n = 10;
//        System.out.println(E204_CountPrimes.countPrimes(n));

//        int[] nums = {3,1,4,1,5};
//        int k = 2;
//        System.out.println(E532_KDiffPairsInAnArray.findPairs(nums, k));


//        String A = "abc";
//        String B = "cabcabca";
//        System.out.println(E686_RepeatedStringMatch.repeatedStringMatch(A, B));

//        int[] nums = {4, 1, 2};
//        System.out.println(E581_ShortestUnsortedContinuousSubarray.findUnsortedSubarray(nums));

//        int[] arr = {0,0,1,1,1,1,2,3,4};
//        System.out.println(RemoveDuplicatesFromSortedArray.removeDup(arr));

        int[] a = {0,0,1,0,0,1,0};
//        int[] b = {4, 9, 3, 11, 10};
//        Hashing_13_GFG.solution(arr, arr.length);
//        Hashin_38_GFG.sol(arr, 11);
//        Hashing_22_GFG.sol(a, b);
 //       Hashin_62_GFG.solve(a);
//        Hashin_37_GFG.solve(a);
//        String_6_GFG.solve("123abc");
//        Counting_Valleys.sol(12, "UDDDUUDDUUUD");
        Jumping_On_The_Clouds.sol(a);
    }
}
package LeetCode;
import LeetCode.ListNode;
public class E21_MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = null;
        ListNode endPtr = null;
    //    newHead = newNode;
        ListNode h1 = l1;
        ListNode h2 = l2;
        while(l1!=null || l2 != null) {
            if(l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    ListNode newNode = new ListNode(l1.val);
                    newNode.next = null; //Create new node
                    if (newHead == null) {  //If this is first node of new list, make end and head point to this new node
                        newHead = newNode;
                        endPtr = newHead;
                    } else {
                        endPtr.next = newNode; //If not first node, just make end point to this node
                        endPtr = endPtr.next;
                    }
                    l1 = l1.next;

                } else if (l2.val < l1.val) {
                    ListNode newNode = new ListNode(l2.val);
                    newNode.next = null; //Create new node
                    if (newHead == null) {  //If this is first node of new list, make end and head point to this new node
                        newHead = newNode;
                        endPtr = newHead;
                    } else {
                        endPtr.next = newNode; //If not first node, just make end point to this node
                        endPtr = endPtr.next;
                    }
                    l2 = l2.next;
                } else {
                    ListNode newNode = new ListNode(l1.val);
                    newNode.next = null; //Create new node
                    if (newHead == null) {  //If this is first node of new list, make end and head point to this new node
                        newHead = newNode;
                        endPtr = newHead;
                    } else {
                        endPtr.next = newNode; //If not first node, just make end point to this node
                        endPtr = endPtr.next;
                    }
                    l1 = l1.next;

                    newNode = new ListNode(l2.val);
                    newNode.next = null; //Create new node
                    if (newHead == null) {  //If this is first node of new list, make end and head point to this new node
                        newHead = newNode;
                        endPtr = newHead;
                    } else {
                        endPtr.next = newNode; //If not first node, just make end point to this node
                        endPtr = endPtr.next;
                    }
                    l2 = l2.next;
                }
            }else if(l1 != null){
                if (newHead == null) {  //If this is first node of new list, make end and head point to this new node
                    return l1;
                } else {
                    endPtr.next = l1; //If not first node, just make end point to this node
                    return newHead;
                }
            } else{
                if (newHead == null) {  //If this is first node of new list, make end and head point to this new node
                    return l2;
                } else {
                    endPtr.next = l2; //If not first node, just make end point to this node
                    return newHead;
                }
            }
        }
        return newHead;
    }


    public static void printList(ListNode l){
        while(l!=null){
            System.out.print(l.val+"->");
            l=l.next;

        }
    }
}

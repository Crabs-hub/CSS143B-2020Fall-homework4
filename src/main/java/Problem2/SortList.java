package Problem2;

import java.util.List;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head) {
        // homework
        if(head == null || head.next == null){
            return head;
        }
        ListNode first = head;
        ListNode second = head;
        while(first != null && first.next.next != null){
            second = second.next;
            if(first.next != null){
                first = first.next.next;
            }else{
                break;
            }
        }
        return second;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        // homework
        ListNode dummy = new ListNode(0);
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode end = dummy;
        while(true){
            if(list1 == null){
                end.next = list2;
                break;
            }
            if(list2 == null){
                end.next = list1;
                break;
            }
            if(list1.val <= list2.val){
                end.next = list1;
                list1 = list1.next;
            }else{
                end.next = list2;
                list2 = list2.next;
            }
            end = end.next;
        }
        return dummy.next;
    }
}

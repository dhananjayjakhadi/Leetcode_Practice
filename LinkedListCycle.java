//Problem: Linked List Cycle

//Analysis: iterate over loop with two pointer fast and slow. Fast iterate by 2 nodes and slow 
//iterate by 1 node. If fast == slow then there is a cycle else it is not. 


public class LinkedListCycle {
    public boolean hasCycle(ListNode head){
            ListNode fast = head;
            ListNode slow = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if(fast == slow){
                return true;
                }
            }
            return false;
        }
    }
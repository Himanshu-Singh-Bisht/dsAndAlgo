public class leetcode
{
    public static void main(String[] args)
    {
        // LEETCODE - 237 , DELETE NODE IN LINKED LIST _________________________
        // ListNode head = [4,5,1,9]
        // deleteNode(5);  // o/p = [4 , 1, 9]

    }
    public static class ListNode 
    {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    // LEETCODE - 237 , DELETE NODE IN LINKED LIST _________________________
    public static void deleteNode(ListNode node) 
    {
        ListNode first = node;
        ListNode second = node.next;
        
        first.val = second.val;
        first.next = second.next;
        second.next = null;
    }


    // LEETCODE - 203 , REMOVE LINKED LIST ELEMENTS _________________________
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        while(curr != null)
        {
            forw = curr.next;
            if(curr.val == val)
            {
                if(prev != null)
                {
                    prev.next = forw;
                    curr.next = null;
                }
                else
                {
                    head = forw;
                }
            }
            else
            {
                prev = curr;
            }
            curr = forw;
        }
        
        return head;
    }


    // LEETCODE - 206 , REVERSE LINKED LIST _________________________
    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        
        while(curr != null)
        {
            forw = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }


    // LEETCODE - 876 , MIDDLE OF LINKED LIST _________________________
    public ListNode middleNode(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return (fast.next == null) ? slow : slow.next;
    }


    // LEETCODE - 234 , PALINDROME LINKED LIST _________________________
    public boolean isPalindrome(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return true;
        }

        if(head.next.next == null)   // NOT NEEDED (BUT IT DECREASES EXECUTION TIME).
        {
            return ((head.val == head.next.val) ? true : false);
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = slow.next;
        head2 = reverseList(head2);
        slow.next = null;
        
        ListNode curr1 = head;
        ListNode curr2 = head2;
        while(curr1 != null && curr2 != null)
        {
            if(curr1.val != curr2.val)
            {
                return false;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        head2 = reverseList(head2);
        slow.next = head2;
        return true;
    }


    // LEETCODE - 141, linked list cycle _____________________________
    public boolean hasCycle(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }
        
        return (slow == fast);
    }


    // leetcode - 142 , linked list cycle - II ____________________________________
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }
        
        if(slow != fast) 
        {
            return null;
        }
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }


    // leetcode - 160 , intersection of two linked list ___________
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA == null || headB == null)
        {
            return null;
        }
        
        if(headA.next == null && headB.next == null && headA.val == headB.val)
        {
            return headA;
        }
        ListNode curr = headA;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        
        curr.next = headB;  // to make cycle
        
        ListNode slow = headA;
        ListNode fast = headA;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                break;
            }
        }
        
        if(slow != fast)
        {
            curr.next = null;
            return null;
        }
        
        slow = headA;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        curr.next = null;   // to break cycle
        return slow;
    }


    // leetcode = 61 , Rotate List ____________
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null)
        {
            return null;
        }
        if(k == 0)
        {
            return head;
        }
        int size = 1;
        ListNode curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
            size++;
        }
        
        k = k % size;
        k = size - k;
        
        curr.next = head;
        while(k-- > 0)
        {
            curr = curr.next;
        }
        
        head = curr.next;
        curr.next = null;
        return head;
    }


    // leetcode - 83 , Remove Duplicate from sorted List_______________
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode curr = head;
        while (curr != null && curr.next != null) 
        {
            ListNode forw = curr.next;
            if (forw.val == curr.val) 
            {
                curr.next = forw.next;
                forw.next = null;
            } 
            else 
            {
                curr = curr.next;
            }
        }
        return head;
    }

    // leetcode 21 , merge two sorted list __________________
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        
        ListNode head = new ListNode(-1);
        
        ListNode curr = head;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                curr.next = l1;
                l1 = l1.next;
            }
            else
            {
                curr.next = l2;
                l2 = l2.next;
            }
            
            curr = curr.next;
        }
        
        if(l1 != null)
        {
            curr.next = l1;
        }
        if(l2 != null)
        {
            curr.next = l2;
        }
           
        return head.next;
    }


    // leetcode - 23 , merge k Sorted Lists___________
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length == 0)
        {
            return null;
        }
        
        return mergeKLists_(lists , 0 , lists.length - 1);
    }
    
    public ListNode mergeKLists_(ListNode[] lists , int si , int ei)
    {
        if(si == ei)
        {
            return lists[si];
        }
        if(si + 1 == ei)
        {
            return mergeTwoSortedLists(lists[si] , lists[ei]);
        }
        
        int mid = (si + ei) / 2;
        ListNode a = mergeKLists_(lists , si , mid);
        ListNode b = mergeKLists_(lists , mid + 1 , ei);
        
        return mergeTwoSortedLists(a , b);
    }
    
    public ListNode mergeTwoSortedLists(ListNode l1 ,ListNode l2)
    {
        if(l1 == null)
        {
            return l2;
        }
        if(l2 == null)
        {
            return l1;
        }
        
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        
        while(l1 != null && l2 != null)
        {
            if(l1.val < l2.val)
            {
                curr.next = l1;
                l1 = l1.next;
            }
            else
            {
                curr.next = l2;
                l2 = l2.next;
            }
            
            curr = curr.next;
        }
        
        if(l1 != null)
        {
            curr.next = l1;
        }
        if(l2 != null)
        {
            curr.next = l2;
        }
        
        return head.next;
    }

    
}
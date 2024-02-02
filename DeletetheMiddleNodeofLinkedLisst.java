class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        
        if (head.next.next == null) {   // only 2 node exist
            head.next = null;
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next.next;
        
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast.next != null)
                fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return head;     
    }  
}
class DeletetheMiddleNodeofLinkedLisst {
    public static void main(String[] args) {
    // Creating a linked list: 1 -> 2 -> 3 -> 4 
    ListNode node1 = new ListNode(1);  
    ListNode node2 = new ListNode(2);  
    ListNode node3 = new ListNode(3);  
    ListNode node4 = new ListNode(4); 
    ListNode node5 = new ListNode(5); 
    node1.next = node2;  
    node2.next = node3; 
    node3.next = node4; 
    node4.next = node5;  
 
    System.out.println("Linked List:");  
    ListNode current = node1;  
    while (current != null) {  
        System.out.print(current.val+" ");  
        current = current.next;  
    }  

    Solution s = new Solution();
    ListNode curr = s.deleteMiddle(node1);
    System.out.println("\nLinked after deleting List:");   
    while (curr != null) {  
        System.out.print(curr.val+" ");  
        curr = curr.next;  
    } 
    }
}

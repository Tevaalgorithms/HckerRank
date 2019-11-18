    static boolean hasCycle(SinglyLinkedListNode head) {
        if(head == null || head.next == null) return false;

        SinglyLinkedListNode fast = head;
        SinglyLinkedListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;                
            }
        }
        return false;

    }

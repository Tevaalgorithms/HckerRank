    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        if(head == null || head.next == null) return head;
        
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode next = head.next;

        while(next != null) {
            if(current.data == next.data) {
                current.next = next.next;
            } else {
                current = next;
            }
            next = next.next;
        }
        return head;

    }

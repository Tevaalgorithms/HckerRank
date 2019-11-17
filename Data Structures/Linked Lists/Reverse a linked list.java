 static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if(head==null) return null;

        SinglyLinkedListNode current, next, previous;
        current = head;
        next = null;
        previous = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current; 
            current = next;
        }

        head = previous;

        return head;

    }

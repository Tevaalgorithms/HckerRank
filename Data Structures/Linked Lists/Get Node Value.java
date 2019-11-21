 static int getNode(SinglyLinkedListNode head, int positionFromTail) {       
        SinglyLinkedListNode A = head;
        SinglyLinkedListNode B = head;
        while(1 <= positionFromTail) {
            B = B.next;
            positionFromTail--;
        }
        while(B.next != null) {
            B = B.next;
            A = A.next;
        }
        return A.data;  
    }

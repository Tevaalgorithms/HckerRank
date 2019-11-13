static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
     SinglyLinkedListNode temp = head;

     if(position == 0){
         head = head.next;
         return head;
     }
     
     int i = 0;
     // Getting the node that is prior to the delete index node
     while( i < position - 1) {     
     temp = temp.next;
     i++;
     }

     SinglyLinkedListNode deleteNode = temp.next;
     
     SinglyLinkedListNode newNext =deleteNode.next;

    temp.next = newNext;

    return head;

    }

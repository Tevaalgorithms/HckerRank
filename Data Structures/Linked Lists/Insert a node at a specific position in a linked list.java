    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
   //Create a new node
   SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

   // Get the reference of the head node
   SinglyLinkedListNode temp = head;

   // In this case, the new node is head node since we are adding it on the 0th index 
   if(position == 0) {
       newNode.next = head;
       return newNode;
   }

   int i = 0; 
   // Here the first node of the element index is "0"
   // The reason I am checking temp != null is to avoid the index that is bigger than       //  the total nodes from the linked list. (Example. 3 nodes are from linked list and     // position is 10. That needs to throw away)
   while((i < position - 1) && temp!=null) {
       temp = temp.next;
       i++;
   }

   SinglyLinkedListNode next = temp.next;
   temp.next = newNode;
   newNode.next = next;

   return head; 

    }

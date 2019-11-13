
    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        // Create a new node
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        // add the head to the new node
        newNode.next = llist;
        // NOTE: here we are returning the newNode.         
        return newNode;     

    }

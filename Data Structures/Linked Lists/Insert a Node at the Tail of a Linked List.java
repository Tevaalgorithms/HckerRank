 // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    
    // Create a new node
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    
    // if we get an empty linkedlist
    if(head==null){
        return newNode;
    }

    // Get the head node reference in a tempNode
    SinglyLinkedListNode tempNode = head;

    // NOTE: Here we are checking tempNode.next != null to get the last node in tempNode
    // If we choose tempNode != null here then the tempNode is not going to be the last      //  node, instead it would be the null empty node.
    while(tempNode.next != null) {
        tempNode = tempNode.next;
    }

    // add the new node to the last node
    tempNode.next = newNode;

    // return the head node. 
    // NOTE: here we don't return the temp node becuase it would point to the last node      // and new node that we just added

    return head;

    }

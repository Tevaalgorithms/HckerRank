    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        // Step 1: Calculate the lenght of the linked lists 
        int len1 = calculateLenght(head1);
        int len2 = calculateLenght(head2);

        // Step 2: Find the longest linked list and move it to the difference
       SinglyLinkedListNode A = head1;
       SinglyLinkedListNode B = head2;

       while(len1 > len2) {
           A = A.next;
           len1--;
       }

       while(len2 > len1) {
           B = B.next;
           len2--;
       }

       // Step 3: Compare each nodes 
       // TEVA, ask youself why can't you use A.data != B.data
       while(A != B) {
           A = A.next;
           B = B.next;
       }
       return A.data; 
    }

    static int calculateLenght(SinglyLinkedListNode head) { 
        int lenght = 0;      
        SinglyLinkedListNode temp = head;   
        while(temp != null) {
                lenght++;
                temp = temp.next;
        }
        return lenght;
    }

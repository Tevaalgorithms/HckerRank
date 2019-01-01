import java.util.*;
import java.io.*;

class Node 
{
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
  
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	static Node insert(Node root, int value) 
    {
        Node newNode = new Node(value);
        newNode.left = null;
        newNode.right = null;

        if (root == null) 
        {
            return newNode;
        }

        addNode(root, newNode);
        return root;
    }

    static void addNode(Node root, Node newNode) 
    {
        if (newNode.data < root.data) 
        {
            if (root.left == null) 
            {
                root.left = newNode;
            } 
            else 
            {
                addNode(root.left, newNode);
            }
        } 
        else 
        {
            if (root.right == null) 
            {
                root.right = newNode;
            } 
            else 
            {
                addNode(root.right, newNode);
            } 
        } 
    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }
}

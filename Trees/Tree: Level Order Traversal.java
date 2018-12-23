import java.util.*;
import java.io.*;

class Node {
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

 public static void levelOrder(Node root) {
      if(root == null) return;
      Queue<Node> qr = new LinkedList<>();
      qr.add(root);
      while(!qr.isEmpty())
      {
          Node d = qr.poll();
          System.out.print(d.data + " ");
          if(d.left != null)
          {
                qr.add(d.left);
          }
          if(d.right != null)
          {
               qr.add(d.right);
          }
      }      
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
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
        levelOrder(root);
    }	
}




	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
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


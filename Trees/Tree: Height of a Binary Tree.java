

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) 
    {
        if (root==null)
            return -1;   
        else
        {
            int leftheight = height(root.left);

            int rightheight = height(root.right);

        
            if(leftheight > rightheight)
                return (leftheight + 1);
            else        
                return (rightheight + 1);

        }
        
    }


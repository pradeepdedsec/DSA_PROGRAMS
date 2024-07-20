package Tree;

public class BinarySearchTree {
    
    Node root;
    

    public void insert(int val){
        if(root==null){
            root=new Node(val);;
        }
        else{
            // Node temp=root;

            // while (temp!=null) {
            //     if(val<temp.data)
            //         temp=temp.left;
            //     else
            //         temp=temp.right;
            // }
            // temp=n;
            // System.out.println(temp.data);

            insertRec(root,val);
        }
    }

    private Node insertRec(Node node,int val) {
        if(node!=null){
            if(node.data>val)
                node.left= insertRec(node.left, val);
            else
                node.right= insertRec(node.right, val);
        }
        else{
            node=new Node(val);
        }

        return node;
    }

    public void showTree(){
        inOrderRec(root);
        System.out.println();
        preOrderRec(root);
        System.out.println();
        postOrderRec(root);
    }

    private void inOrderRec(Node node){
        if(node!=null){
            inOrderRec(node.left);
            System.out.print(" "+node.data+" ");
            inOrderRec(node.right);
        }
    }

    private void preOrderRec(Node node){
        if(node!=null){
            preOrderRec(node.left);
            preOrderRec(node.right);
            System.out.print(" "+node.data+" ");
        }
    }

    private void postOrderRec(Node node){
        if(node!=null){
            System.out.print(" "+node.data+" ");
            postOrderRec(node.left);
            postOrderRec(node.right);
        }
    }
}

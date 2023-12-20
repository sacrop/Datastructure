public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insertNode(10);
        bst.insertNode(20);
        bst.insertNode(33);
        bst.insertNode(34);
        bst.display();
        bst.delete(33);
        bst.display();
    }
    class Node{
        private int val;
        private Node left;
        private Node right;
        Node(int val){
            this.val=val;
        }
    }
    private Node root;

    public void insertNode(int val){
        root=insertNode(root,val);
    }
    private Node insertNode(Node node,int val){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val<node.val){
            node.left=insertNode(node.left,val);
        }
        else{
            node.right=insertNode(node.right,val);
        }
        return node;
    }

    public void display(){
        display(root,"Root node is :");
    }
    private void display(Node node,String message){
        if(node==null){
            return;
        }
        System.out.println(message+node.val);
        display(node.left,"left child of "+node.val+" is :");
        display(node.right,"right child of "+node.val+" is :");
    }
    public void delete(int val){
        root=delete(root,val);
    }
    private Node delete(Node node,int val){
        if(node==null){
            return null;
        }
        if(val>node.val){
            node.right=delete(node.right,val);
        }
        else if(val<node.val){
            node.left=delete(node.left,val);
        }
        else{
            if(node.left==null){
                return node.right;
            }
            else if(node.right==null){
                return node.left;
            }
            else{
                node.val=Minval(node.right);
                node.right=delete(node.right,node.val);
            }
        }
        return node;
    }
    private int Minval(Node node){
        int min=node.val;
        while(node.left!=null){
            min=node.left.val;
            node=node.left;
        }
        return min;
    }
    
}

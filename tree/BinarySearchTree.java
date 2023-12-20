public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insertNode(10);
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
        display(node.left,"left child of "+node.val);
        display(node.right,"right child of "+node.val);
    }
    
}

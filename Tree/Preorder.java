class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left=right=null;
    }
}


public class Preorder {

    static void preorder_traversal(Node root){
        if(root==null) return;

        System.out.print(root.data+" ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        preorder_traversal(root);
    }
    
}

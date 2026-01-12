class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left=right=null;
    }
}


public class Postorder {

    static void postorder_traversal(Node root){
        if(root==null) return;

        postorder_traversal(root.left);
        postorder_traversal(root.right);
        System.out.print(root.data+" ");
       
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        postorder_traversal(root);
    }
    
}

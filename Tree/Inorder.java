class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Inorder {
    static void inorder_traversal(Node root){
        if(root == null)
            return;

        inorder_traversal(root.left);
        System.out.print(root.data + " ");
        inorder_traversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        inorder_traversal(root);

    }
    
}

class TreeStruct {
    int data;
    TreeStruct left, right;

    TreeStruct(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TreeStructMain{
    public static void main(String[] args) {
        TreeStruct root = new TreeStruct(10);
        root.left = new TreeStruct(5);
        root.right = new TreeStruct(15);

        System.out.println(root.data + " -> " + root.left.data + " -> " + root.right.data);
    }
}
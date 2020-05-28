package src.trees;

public class PreOrder {
    public static void main(String args[])
    {
        Node root = new Node(25);

        root.left = new Node(15);
        root.right = new Node(50);
        root.left.left = new Node(10);
        root.left.right = new Node(22);
        root.right.left = new Node(35);
        root.right.right = new Node(70);

        preOrder(root);
    }

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        return;
    }
}

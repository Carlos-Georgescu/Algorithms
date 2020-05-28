package src.trees;

public class InOrder {
    public static void main(String args[])
    {
        Node root = new Node(25);

        root.left = new Node(15);
        root.right = new Node(50);
        root.left.left = new Node(10);
        root.left.right = new Node(22);
        root.right.left = new Node(35);
        root.right.right = new Node(70);

        inOrder(root);
    }
    public static void inOrder(Node node)
    {
        if(node==null)
            return;

        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
}

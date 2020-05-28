package src.trees;

public class PostOrder {
    public static void main(String args[])
    {
        Node root = new Node(25);

        root.left = new Node(15);
        root.right = new Node(50);
        root.left.left = new Node(10);
        root.left.right = new Node(22);
        root.right.left = new Node(35);
        root.right.right = new Node(70);

        postOrder(root);
    }
    public static void postOrder(Node node)
    {
        if(node==null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
}

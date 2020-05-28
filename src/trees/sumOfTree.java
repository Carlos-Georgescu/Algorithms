package src.trees;

public class sumOfTree {
    public static int sum = 0;
    public static void main(String args[])
    {
        Node root = new Node(25);

        root.left = new Node(15);
        root.right = new Node(50);
        root.left.left = new Node(10);
        root.left.right = new Node(22);
        root.right.left = new Node(35);
        root.right.right = new Node(70);

        addition(root);
        System.out.println(sum);
    }
    public static void addition(Node node)
    {
        if(node == null) {
            return;
        }
        sum += node.data;
        //System.out.println(node.data);
        addition(node.right);
        //System.out.println(node.data);
        addition(node.left);
        //sum += node.left.data;
        return;
    }
}

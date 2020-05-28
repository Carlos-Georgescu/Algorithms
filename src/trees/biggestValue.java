package src.trees;

//finds the biggest value in the tree
public class biggestValue {
    public static int biggestNum = Integer.MIN_VALUE;
    public static void main(String args[])
    {
        Node root = new Node(25);
        root.left = new Node(15);
        root.right = new Node(50);
        root.left.left = new Node(10);
        root.left.right = new Node(22);
        root.right.left = new Node(35);
        root.right.right = new Node(70);

        biggest(root);
        System.out.println(biggestNum);
    }

    public static void biggest(Node node)
    {
        if(node==null)
            return;

        if(node.data>biggestNum)
            biggestNum = node.data;
        biggest(node.left);
        biggest(node.right);
    }
}

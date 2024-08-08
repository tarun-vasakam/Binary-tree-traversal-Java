class Node{
    int data;
    Node left,right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Tree{
    static void Inorder(Node node){
        if (node == null)
        {
            return;
        }
        Inorder(node.left);
        System.out.print(node.data+" ");
        Inorder(node.right);
    }
    static void Preorder(Node node){
        if (node == null)
        {
            return;
        }
        System.out.print(node.data+" ");
        Preorder(node.left);
        Preorder(node.right);
    }
    static void Postorder(Node node){
        if (node == null)
        {
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.print('\n');
        System.out.println("Inorder Traversal :");
        Inorder(root);
        System.out.println();
        System.out.println("Preorder Traversal :");
        Preorder(root);
        System.out.println();
        System.out.println("Postorder Traversal :");
        Postorder(root);
    }
}

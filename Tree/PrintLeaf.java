//34] print leaf node

package Tree;

public class PrintLeaf {
    static class Node
    {
        public int data;
        public Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    };

    public void printleaf(Node root){
            if(root==null){
                return;
            }
            if(root.left == null && root.right == null){
                System.out.print(root.data + " ");
                return;
            }
        if (root.left != null)
            printleaf(root.left);

        // If right child exists, check for leaf
        // recursively
        if (root.right != null)
            printleaf(root.right);

    }

    public static void main(String[] args) {
       Node obj = new Node(12);
       obj.left = new Node(14);
       obj.right = new Node(13);
       obj.left.right = new Node(25);
       obj.left.left = new Node(73);
       PrintLeaf p = new PrintLeaf();
       p.printleaf(obj);

    }
}

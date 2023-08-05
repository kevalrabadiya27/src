//Binary Tree traversal
package Tree;

class Node {
    int value;
    Node left,right;
    Node(int value) {
        this.value = value;
    }
}
public class BinaryTree {
     Node root = null;
    public static void inorder(Node node){
         if (node != null){
             inorder(node.left);
             System.out.print(node.value + " ");
             inorder(node.right);
         }
     }
    public static void preorder(Node node){
        if (node != null){
            System.out.print(node.value+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public static void postorder(Node node){
        if (node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void main(String[] args) {
        Node b = new Node(1);
        b.left = new Node(4);
        b.right = new Node(78);
        b.left.left = new Node(70);
        b.left.right = new Node(48);
        inorder(b);
        System.out.println(" ");
        preorder(b);
        System.out.println(" ");
        postorder(b);
    }
}

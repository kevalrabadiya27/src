//28]  WAP to sort an Array using Tree sort.
package sorting;
public class TreeSort {

    class  Node{
        int key;
        Node left,Right;

        public Node(int item){
            key = item;
            left = Right = null;
        }
    }
//    root of BST
    Node root;

//    Constructor
    TreeSort(){
        root = null;
    }
//    this method mainly calls insertRec()
    void insert(int key){
        root = insertRec(root,key);
    }

//    a Recursive function insert a new key
    Node insertRec(Node root,int key){
//     if tree is empty so new node create
        if(root == null){
            root  = new Node(key);
            return root;
        }
//        otherwise ,down the tree
        if(key<root.key){
            root.left = insertRec(root.left,key);
        }
        else if(key>root.key){
            root.Right = insertRec(root.Right,key);
        }
        return root;
    }
//    inorder traversel in tree
    void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left);
            System.out.print(root.key+" ");
            inorderRec(root.Right);

        }
    }

    void treeIns(int arr[]){

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
    }
    public static void main(String[] args) {
        TreeSort t = new TreeSort();
        int arr[] = {8,11,69,99,23,10,55};
        t.treeIns(arr);
        t.inorderRec(t.root);
    }
}

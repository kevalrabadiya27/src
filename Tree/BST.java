package Tree;

import java.util.ArrayList;
import java.util.Arrays;

class BSTNode{
    int data;
    BSTNode left,right;
    BSTNode(int data){
        this.data = data;
    }
}
public class BST {
    BSTNode root;
    BSTNode insert(int data,BSTNode root){
        if(root == null){
            root = new BSTNode(data);
        }else if(data<=root.data){
            root.left = insert(data,root.left);
        }else {
            root.right = insert(data,root.right);
        }
        return root;
    }
//    search element in tree
    BSTNode search(int data,BSTNode root){
        if(root.data == data ){
            return root;
        }else if(data< root.data){
             return search(data,root.left);
        }else {
           return search(data,root.right);
        }
    }
//    delete
    BSTNode delete(int data,BSTNode root){
        if(root==null) return root;
        if(data<root.data){
            root.left = delete(data,root.left);
        }else if(data> root.data){
            root.right = delete(data,root.right);
        }else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minvalue(root.right);
            root.right = delete(root.data, root.right);
        }
        return root;
    }

    void SecondMinValue(BSTNode root,ArrayList<Integer> ar){
        if (root==null){
            return;
        }
        SecondMinValue(root.left,ar);
        ar.add(root.data);
        SecondMinValue(root.right,ar);
    }

    int minvalue(BSTNode root){

        int minv = root.data;
        while (root.left!=null){
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
//    traversel
    public void inorder(BSTNode root){
        if (root==null){
            return;
        }
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
    }

    public static void main(String[] args) {
        try {
            BST obj = new BST();
            obj.root = obj.insert(47,obj.root);
            obj.root = obj.insert(89,obj.root);
            obj.root = obj.insert(49,obj.root);
            obj.root = obj.insert(5,obj.root);
            obj.root = obj.insert(2,obj.root);
            obj.root = obj.insert(19,obj.root);
            ArrayList<Integer> ar = new ArrayList<>();
            obj.inorder(obj.root);
            obj.SecondMinValue(obj.root,ar);
            System.out.println("Second minimum:"+ ar.get(1));
//            BSTNode find = obj.search(49,obj.root);
//            obj.root = obj.delete(47,obj.root);
//            System.out.println("after deleted");
//            obj.inorder(obj.root);
//             obj.SecondMinValue(obj.root);
//            if(find == null){
//                System.out.println("Element are not found ");
//            }else {
//                System.out.println("Element are found:"+find.data);
//            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

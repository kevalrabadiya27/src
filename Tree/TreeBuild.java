package Tree;

import java.util.Scanner;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode Right;

    TreeNode(int data){
        this.data = data;
    }

    static TreeNode createTree(){
        TreeNode root = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data:");
        int d = sc.nextInt();
        if(d==-1){
            return null;
        }
        root = new TreeNode(d);
        System.out.println("Enter left data:"+d);
        root.left = createTree();
        System.out.println("Enter right data:"+d);
        root.Right = createTree();
        return root;
    }
}

public class TreeBuild {
    public static void main(String[] args) {
        TreeNode.createTree();
    }
}


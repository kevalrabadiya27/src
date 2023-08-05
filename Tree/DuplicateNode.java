//61]Given the root of a binary search tree (BST) with duplicates, return all the node(s) (i.e., the
//most frequently occurred element) in it.

package Tree;
import java.util.*;
class block{
    int data;
    block left,right;

    public block(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class DuplicateNode {
    block root;
    block Insert(int data,block root){
        if(root == null){
            root = new block(data);
        }else if(data<=root.data){
          root.left = Insert(data,root.left);
        }else{
            root.right = Insert(data,root.right);
        }
        return root;
    }
    //    traversel
    public void inorder(block root){
        if (root!=null){
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }
    }

    public void duplicate(block root){
        if(root==null){
            return;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<block> q = new LinkedList<>();
        q.offer(root);
        int max = 0;

        while(!q.isEmpty()){
            block temp = q.remove();
            int nc = map.getOrDefault(temp.data,0)+1;
            max = nc>max?nc:max;
            map.put(temp.data,nc);
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
        ArrayList<Integer> ar = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==max) ar.add(e.getKey());
        }
        int[] arr = new int[ar.size()];

        for(int i=0;i<ar.size();i++) {
            arr[i] = ar.get(i);
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
      DuplicateNode obj = new DuplicateNode();
      obj.root = obj.Insert(47,obj.root);
      obj.root = obj.Insert(75,obj.root);
      obj.root = obj.Insert(75,obj.root);
        obj.root = obj.Insert(47,obj.root);
      obj.inorder(obj.root);
        System.out.println("--duplicate node are----");
      obj.duplicate(obj.root);
    }
}

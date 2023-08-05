package DSA.LinkedList;

class DL{
    Node head;
    public class Node{
        int data;
        Node pre;
        Node next;

        Node(int data){
            this.data = data;
            this.pre = null;
            this.next = null;
        }
    }
    void InsertHead(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head.pre = newnode;
            head = newnode;
        }
    }
    void InsertLast(int data){
        if(head==null){
            InsertHead(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.pre = temp;
        temp = newnode;
    }

    void positionIns(int data,int pos){
        if(head == null){
            InsertHead(data);
            return;
        }
        Node newnode = new Node(data);
        Node temp = head;
        int cnt = 1;

        while(cnt<pos-1){
            temp = temp.next;
            cnt++;
        }
        if(temp.next==null){
            temp.next = newnode;
            newnode.pre = temp;
        }else {
            newnode.next = temp.next;
            temp.next.pre = newnode;
            newnode.pre = temp;
            temp.next = newnode;
        }
    }
    void delete(int pos){
        if(pos==1){
             Node temp = head;
//            temp = temp.next;
//            head = temp;
//            head.pre = null;
            temp.next.pre = null;
            head = temp.next;
            temp.next = null;
            return;
        }else{
            Node before = null;
            Node current = head;
            int cnt = 1;
            while (cnt<pos){
                before= current;
                current = current.next;
                cnt++;
            }
            current.pre = null;
            before.next =current.next;
            current.next = null;
        }
    }
    void Reversed(){
        Node pre = null;
        Node current = head;

        while(current!=null){
            Node forward = current.next;
            current.next = pre;
            pre = current;
            current = forward;
        }
//        because current and forward are null and pre pointer are pointing to last node
        while (pre!=null){
            System.out.println(pre.data+"");
            pre = pre.next;
        }
    }

    void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
    }
}

public class Doubly {
    public static void main(String[] args) {
        DL node = new DL();
        node.InsertHead(14);
        node.InsertHead(24);
        node.InsertLast(45);
        node.InsertLast(69);
        node.positionIns(66,4);
//        node.delete(3);
        node.print();
        node.Reversed();

    }
}

package DSA.LinkedList;

class LL{
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void insertHead(int data){
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    void addLast(int data){
        Node temp = new Node(data);

        if(head == null){
            head = temp;
            return;
        }
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }
            last.next = temp;
    }
    void InsertMiddle(int postion,int data){
//        insert fisrt one
        if(postion==1){
//          otherwise call to above insertHead function
            Node temp = new Node(data);
            temp.next = head;
            head=temp;
            return;
        }
        Node temp = head;
        int cnt = 1;
//        create new node
        Node newNode = new Node(data);

        while (cnt<postion-1){
            temp = temp.next;
            cnt++;
        }
            newNode.next = temp.next;
            temp.next = newNode;
    }

    void delete(int position){

        if(position==1){
            Node temp = head;
            head = head.next;
            temp.next = null;
            return;
        }
        else {
            Node current = head;
            Node pre=null;
            int cnt = 1;

            while (cnt<position){
                pre = current;
                current = current.next;
                cnt++;
            }
            pre.next = current.next;
            current.next = null;
        }
    }

    void print(){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class Singly {
    public static void main(String[] args) {
        LL node = new LL();
        node.insertHead(47);
        node.insertHead(56);
        node.addLast(55);
        node.InsertMiddle(1,66);
        node.delete(1);
        node.print();
    }
}

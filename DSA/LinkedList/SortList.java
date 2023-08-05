//38] WAP to add an element into already sorted singly linked list.

package DSA.LinkedList;
public class SortList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
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
    void AscOrder(int data){
        Node newnode = new Node(data);

        if(head== null){
            head = newnode;
            return;
        }
        if(head.data>newnode.data){
            newnode.next= head;
            head = newnode;
            return;
        }

        Node temp = head;
        while(temp.next!=null && temp.next.data<newnode.data){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void printNode(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SortList ob = new SortList();
        ob.addLast(10);
        ob.addLast(15);
        ob.addLast(19);
//        insertOrder (sort)
        ob.AscOrder(17);
        ob.printNode(ob.head);
    }
}

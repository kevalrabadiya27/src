package sorting;

public class LL {
    Node head;

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data){
      Node newnode = new Node(data);
      newnode.next = head;
      head = newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
          return;
        }
        Node lastnode = head;
        while (lastnode.next!=null){
            lastnode = lastnode.next;
        }

         lastnode.next = newnode;
         newnode.next = null;
    }

    public void display(){
        Node currnode = head;

        while (currnode!=null){
            System.out.println(currnode.data);
            currnode = currnode.next;
        }
    }

    public  void removefirst(){
        if(head==null){
            System.out.println("string is already empty");
            return;
        }
        head = this.head.next;
    }

    public void removelast(){
        if(head==null){
            System.out.println("string is already empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node currnode = head;
        Node lastnode = head.next;

        while (lastnode.next!=null){
            lastnode = lastnode.next;
            currnode = currnode.next;
        }
        currnode.next =null;
    }
    public static void main(String[] args) {
     LL list = new  LL();
     list.addfirst(25);
     list.addfirst(65);
     list.addlast(58);
     list.removefirst();
     list.removelast();
     list.display();
    }
}

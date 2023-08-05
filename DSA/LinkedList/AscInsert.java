//37] WAP to sort a number in ascending order in singly linked list.
package DSA.LinkedList;
public class AscInsert {
    Node head;
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
     }

     void AscOrder(int data){
         Node newnode = new Node(data);

         if(head ==null){
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
       AscInsert ob = new AscInsert();
       ob.AscOrder(13);
       ob.AscOrder(5);
       ob.AscOrder(12);
       ob.AscOrder(10);
       ob.AscOrder(35);

       ob.printNode(ob.head);
    }
}

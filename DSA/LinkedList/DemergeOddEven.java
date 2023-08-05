//59] WAP to demerge a doubly linked list into 2 list, one list will hold the odd numbers while
//another list will hold only even number.
package DSA.LinkedList;
public class DemergeOddEven {
    Node head;
     class Node{
         int data;
         Node pre;
         Node next;

        public Node(int data){
            this.pre = null;
             this.data = data;
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
    void print(){
         Node temp = head;
         while(temp!=null){
             System.out.print(temp.data+ " ");
             temp = temp.next;
         }
    }
    void AggregateList(Node head){
        DemergeOddEven even = new DemergeOddEven();
        DemergeOddEven odd = new DemergeOddEven();
        Node temp =head;
         while (temp!=null){
             if(temp.data%2==0){
                 even.InsertLast(temp.data);
             }else{
                 odd.InsertLast(temp.data);
             }
             temp = temp.next;
         }
        System.out.println("modified linked list");
        odd.print();
        System.out.println();
        even.print();

    }
    public static void main(String[] args) {
            DemergeOddEven ob = new DemergeOddEven();
            ob.InsertLast(14);
            ob.InsertLast(25);
            ob.InsertLast(35);
            ob.InsertLast(36);
            ob.InsertLast(48);
            System.out.println("Original Linked list");
            ob.print();
            ob.AggregateList(ob.head);
    }
}

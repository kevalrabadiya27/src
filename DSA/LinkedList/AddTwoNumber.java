//65 You are given two non-empty linked lists representing two non-negative integers. The digits
//are stored in reverse order, and each of their nodes contains a single digit. Add the two
//numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0
//itself.
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.


package DSA.LinkedList;
public class AddTwoNumber {
    Node head;
     class Node {
        int data;
        Node next;

        Node(int data) {
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
        void printlist(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }
        void reverse(Node head){
            Node curr = head;
            Node pre = null;
            Node next = null;

            while(curr!=null){
                next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }
            printlist(pre);
        }
        


    public static void main(String[] args) {
        AddTwoNumber L1 = new AddTwoNumber();
        AddTwoNumber L2 = new AddTwoNumber();
        L1.addLast(3);
        L1.addLast(5);
        L2.addLast(9);
        L2.addLast(2);
        L1.printlist(L1.head);
        System.out.println();
        L2.printlist(L2.head);
        System.out.println();
        AddTwoNumber L3 = new AddTwoNumber();
        int carry = 0;
        Node firstHead = L1.head;
        Node secondHead = L2.head;
        Node temp1 = firstHead;
        Node temp2 = secondHead;

        while(temp1!=null || temp2!=null){
            int sum = carry + temp1.data + temp2.data;

            if(sum > 9){
                L3.addLast(sum%10);
                carry = sum/10;
            }else{
                L3.addLast(sum);
                carry = 0;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(carry != 0){
            L3.addLast(carry);
        }
        L3.printlist(L3.head);
    }
}

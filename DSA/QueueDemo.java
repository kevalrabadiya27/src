package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

class Queue{
    int arr[];
    int rear;
    int front;
    int size;

     Queue(int size){
        this.size = size;
        arr = new int[size];
        rear=0;
        front=0;
    }
    void insert(int data){
//         space saved
        if(front==rear){
            front=0;
            rear=0;
        }
        if(rear==size) {
            System.out.println("Queue is full");
            return;
        }
        else{
            arr[rear]=data;
            rear++;
        }
    }
    void pop(){
         if(rear==front){
             System.out.println("queue is empty");
         }else{
             arr[front]=-1;
             front++;
         }
    }
    void isEmpty(){
         if(front==rear){
             System.out.println("Empty");
         }else{
             System.out.println("not empty");
         }
    }
    void print(){
        while (front!=rear){
            System.out.println(arr[front]);
            front++;
        }
    }
}
public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(14);
        q.insert(34);
        q.insert(44);
        q.pop();
        q.isEmpty();
        q.print();


    }
}

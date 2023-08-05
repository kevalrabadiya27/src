package DSA;

class STC{
    int size;
    int arr[];
    int top;

    STC(int size){
        this.size = size;
        arr= new int[size];
        top = -1;
    }
    void print(){
        while(top>=0) {
            System.out.print(arr[top] + " ");
            top--;
        }
    }

    void push(int n){
        if((size-top)>1){
            top++;
            arr[top] = n;
        }else{
            System.out.println("-------------");
            System.out.println("Stack OverFlow");
        }
    }
    void pop(){
        if(top!=-1){
            top--;
        }else{
            System.out.println("Stack underflow");
        }
    }
    void isEmpty(){
        if(top!=-1){
            System.out.println("not Empty");
        }else{
            System.out.println("stack Empty");
        }
    }

    void top(){
        if(top!=-1){
            System.out.println("top of " + arr[top]);
        }else{
            System.out.println("stack empty");
        }
    }

}

public class StackDemo{
    public static void main(String[] args) {
        STC st = new STC(5);
        st.push(5);
        st.push(51);
        st.push(87);
        st.pop();
        st.isEmpty();
        st.top();
        st.print();

    }

}

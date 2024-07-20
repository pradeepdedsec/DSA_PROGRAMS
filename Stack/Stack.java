package Stack;

public class Stack {
    
    private int arr[]=new int[0];
    private int tos=-1;
    

    public void push(int val){
        expand();

        tos++;

        arr[tos]=val;
    }

    public int pop(){
        int data=0;

        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            data=arr[tos];
            tos--;
            shrink();
        }

        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[tos];
    }

    private void shrink() {
        int temp[]=new int [arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            temp[i]=arr[i];
        }
        arr=temp;
        temp=null;
    }

    private void expand() {
        int temp[]=new int [arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        arr=temp;
        temp=null;
    }

    public int size(){
        return arr.length;
    }

    public boolean isEmpty(){
        return arr.length==0;
    }

    @Override
    public String toString() {
        String s="[ ";

        for (int i : arr) {
            s+=i+" ";
        }
        s+="]";
        return s;
    }
}

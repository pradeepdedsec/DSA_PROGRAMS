package Queue;

public class Queue {
    
    private int arr[]=new int[0];
    int first=0;
    int last=-1;

    public int getFirst() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return arr[this.first];
        }
    }

    public int getLast() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            return arr[this.last];
        }
    }


    public void enQueue(int val){
        expand();
        last++;
        arr[last]=val;
    }

    public int deQueue(){
        int data=-1;

        if(!isEmpty()){
            data=arr[first];
            shrink();
        }
        else{
            System.out.println("Queue is empty");
        }
        return data;
    }

    private void expand() {
        int temp[]=new int [arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            temp[i]=arr[i];
        }
        arr=temp;
        temp=null;
    }

    private void shrink() {
        int temp[]=new int [arr.length-1];

        for (int i = 1; i < arr.length; i++) {
            temp[i-1]=arr[i];
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

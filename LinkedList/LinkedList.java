package LinkedList;

public class LinkedList {
    
    Node head=new Node();

    public void insert(int val){

        Node node =head;
        Node n=new Node();
        n.value=val;

        if(head.next==null){
            head.next=n;
        }
        else{
            while(node.next!=null){
                node=node.next;
            }
            node.next=n;
        }
    }

    @Override
    public String toString() {
        String s="";

        Node n=head;
        n=n.next;

        while (n!=null) {
            s+=n.value+" ";
            n=n.next;
        }
        return s;
    }

    public void show(){
        Node n=head;
        n=n.next;

        while (n!=null) {
            System.out.print(n.value+" ");
            n=n.next;
        }
    }

    public void insertAtFirst(int val){
        Node node=new Node();
        node.value=val;

        node.next=head.next;
        head.next=node;
    }

    public void insertAt(int index,int val){
        if(index==0){
            insertAtFirst(val);
        }
        else{
            Node node=head;
            node=node.next;

            for (int i = 0; i<index-1 && node.next!=null; i++) {
                node=node.next;
            }

            Node n=new Node();
            n.value=val;

            if(node.next==null){
                node.next=n;
            }
            else{
                n.next=node.next;
                node.next=n;
            }
            
        }
    }

    public void deleteAt(int index){

        Node node=head;

        if(index==0){
            node.next=node.next.next;
        }
        else{
            node=node.next;

            for (int i = 0; i<index-1 && node.next!=null; i++) {
                node=node.next;
            }

            if(node.next!=null){
                node.next=node.next.next;
            } 
        }
    }
}

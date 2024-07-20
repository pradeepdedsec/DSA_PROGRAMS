package LinkedList;


public class Runner {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.insertAtFirst(0);

        list.insertAt(4, 7);

        list.deleteAt(2);

        System.out.println(list);
    }
}



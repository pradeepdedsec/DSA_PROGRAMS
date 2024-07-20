package Queue;

public class Runner {
    public static void main(String[] args) {
        Queue q1=new Queue();

        q1.deQueue();
        System.out.println("Queue at initial state :"+q1);

        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);
        q1.enQueue(5);
        q1.enQueue(6);

        System.out.println("Queue after enqueuing elements :"+q1);

        q1.deQueue();
        q1.deQueue();

        System.out.println("Queue after dequeuing a element :"+q1);
    }
}

package Stack;

public class Runner {
    public static void main(String[] args) {
        
        Stack s1=new Stack();

        s1.pop();
        System.out.println("Stack at the Initial State :"+s1);

        s1.push(1);
        s1.push(2);
        s1.push(3);

        System.out.println("Stack after pushing elements :"+s1);

        System.out.println("Top of the Stack :"+s1.peek());

        s1.pop();

        System.out.println("Stack after poping a element :"+s1);

        System.out.println("Size of the stack :"+s1.size());

        System.out.println("Stack is empty :"+s1.isEmpty());

    }
}

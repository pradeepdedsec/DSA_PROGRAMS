package Tree;

public class Runner {
    public static void main(String[] args) {
        BinarySearchTree b1=new BinarySearchTree();

        b1.insert(1);
        b1.insert(3);
        b1.insert(4);
        b1.insert(3);
        b1.insert(2);
        
        b1.showTree();
    }
}


// Main.java
import java.util.Random;

public class App {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            tree.insert(rand.nextInt(1001) - 500);
        }

        System.out.println("Tree after inserting 100 elements:");
        tree.printTree();

        for (int i = 0; i < 20; i++) {
            tree.delete(rand.nextInt(1001) - 500);
        }

        System.out.println("\nTree after removing 20 elements:");
        tree.printTree();
    }
}

package main;
import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(50);
        tree.insert(10);
        tree.insert(65);
        tree.insert(20);
        tree.insert(53);
        tree.insert(42);
        System.out.println("Using in-order traversal");
        tree.inOrder(tree.getRoot());

        System.out.println("Using preOrder traversal");
        tree.preOrder(tree.getRoot());

        tree.insert(35);

        System.out.println("using postOrder traversal");
        tree.postOrder(tree.getRoot());
        System.out.println(tree.search(20));
        System.out.println(tree.search(52));

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int data) {
            this.val = data;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the value of root Node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter a value to the left of " + node.val + "? (true/false)");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value for left of " + node.val + ":");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter a value to the right of " + node.val + "? (true/false)");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value for right of " + node.val + ":");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }
    public void prettyDisplay(Node node){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node==null){
            return;
        }
        if(level!=0){
            for (int i = 0; i <level-1; i++) {
                System.out.println("|------>" + node.val);
            }
        } else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        System.out.println("Tree Structure:");
        tree.display();
        scanner.close();


    }
}

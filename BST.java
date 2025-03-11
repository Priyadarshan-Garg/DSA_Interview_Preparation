public class BST {
    public static class Node{
        private int val;
        private int height;
        private Node right;
        private Node left;

        public Node(int val){
            this.val=val;
        }
        public int getValue(){
            return val;
        }

        
    }
    protected Node root;

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root Node");
    }

    private void display(Node node, String details) {
        if(node==null){
            return;
        }
        System.out.println(details + node.getValue());
        display(node.left,"Left child of "+node.getValue());
        display(node.right,"Right child of "+node.getValue());
    }
    public void insert(int value){
        root = insert(value,root);
    }
    public Node insert(int value,Node node){
        if(node==null){
          Node N = new Node(value);
            return N;
        }
        if(value< node.getValue()){
          node.left = insert(value,node.left);
        } else if (value> node.getValue()) {
          node.right =  insert(value,node.right);
        }
        node.height = Math.max(getHeight(node.right),getHeight(node.left)) +1;
   return  node; }

}

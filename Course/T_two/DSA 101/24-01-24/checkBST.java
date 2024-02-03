class checkBST {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        System.out.println(isBST(root));
    }

    static boolean isBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;
        if (root.data < min || root.data > max)
            return false;
        return isBST(root.left, min, root.data - 1) && isBST(root.right, root.data + 1, max);
    }
}

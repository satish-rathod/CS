class Node {
    int data;
    Node left, right;
    
    Node (int data) {
        this.data = data;
        left = right = null;
    }
}
public class mirror_trees {
    
    boolean mirror (Node a, Node b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        
        return (a.data == b.data) && mirror(a.left, b.right) && mirror(a.right, b.left);
    }

    Node mirrorTree (Node root) {
        if (root == null) return null;
        
        Node left = mirrorTree(root.left);
        Node right = mirrorTree(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }
}

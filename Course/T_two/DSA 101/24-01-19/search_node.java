
public class search_node {
    
    boolean search (Node root, int data) {
        if (root == null) return false;
        
        if (root.data == data) return true;
        
        return search(root.left, data) || search(root.right, data);
    }
}

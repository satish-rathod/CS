class node {
    int data;
    node left;
    node right;
    public int hd;
    
    node (int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class construct_binarytree {

    public static node constructTreeHelper (int[] pre, int[] in, int preStart, int preEnd, int inStart, int inEnd) {
        
        if (preStart > preEnd || inStart > inEnd) return null;
        
        int rootData = pre[preStart];
        node root = new node(rootData);
        
        int rootIndex = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == rootData) {
                rootIndex = i;
                break;
            }
        }
        
        if (rootIndex == -1) return null;
        
        int leftInStart = inStart;
        int leftInEnd = rootIndex - 1;
        int leftPreStart = preStart + 1;
        int leftPreEnd = leftInEnd - leftInStart + leftPreStart;
        int rightPreStart = leftPreEnd + 1;
        int rightPreEnd = preEnd;
        int rightInStart = rootIndex + 1;
        int rightInEnd = inEnd;
        
        root.left = constructTreeHelper(pre, in, leftPreStart, leftPreEnd, leftInStart, leftInEnd);
        root.right = constructTreeHelper(pre, in, rightPreStart, rightPreEnd, rightInStart, rightInEnd);
        
        return root;
        
    }

    public static node constructTree (int[] pre, int [] in) {

        int n = pre.length;
        return constructTreeHelper(pre, in, 0, n - 1, 0, n - 1);
        
    }
    
}

/* 
 * 
 * 
*/

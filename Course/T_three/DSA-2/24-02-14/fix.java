import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
    }
}

public class fix {
        
    TreeNode BBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = BBST(arr, start, mid - 1);
        root.right = BBST(arr, mid + 1, end);
        return root;
    }

    TreeNode SelfBalancingBST(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return BBST(arr, 0, arr.size() - 1);
    }

    void fixBST (TreeNode root, ArrayList<Integer> arr, int max, int min) {
        
        if (root == null) {
            return;
        }

        if (root.data < min || root.data > max) {
            arr.add(root.data);
        }

        fixBST(root.left, arr, root.data, min);
        fixBST(root.right, arr, max, root.data);
    }
    
    void swap (TreeNode A, TreeNode B) {
        
    }
}



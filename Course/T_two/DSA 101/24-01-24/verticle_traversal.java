import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  * int val;
//  * TreeNode left;
//  * TreeNode right;
//  * TreeNode() {}
//  * TreeNode(int val) { this.val = val; }
//  * TreeNode(int val, TreeNode left, TreeNode right) {
//  * this.val = val;
//  * this.left = left;
//  * this.right = right;
//  * }
//  * }
//  */

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// class Solution {
//     public List<List<Integer>> verticalTraversal(TreeNode root) {

//         List<List<Integer>> result = new ArrayList<>();

//         if (root == null) {
//             return result;
//         }

//         Map<Integer, List<Integer>> columnMap = new TreeMap<>();

//         verticalTraversalHelper(root, 0, 0, columnMap);

//         for (List<Integer> list : columnMap.values()) {
//             result.add(list);
//         }

//         return result;
//     }

//     private void verticalTraversalHelper(TreeNode node, int column, int level, Map<Integer, List<Integer>> columnMap) {
//         if (node == null) {
//             return;
//         }

//         if (!columnMap.containsKey(column)) {
//             columnMap.put(column, new ArrayList<>());
//         }

//         columnMap.get(column).add(node.val);

//         verticalTraversalHelper(node.left, column - 1, level + 1, columnMap);
//         verticalTraversalHelper(node.right, column + 1, level + 1, columnMap);
//     }
// }

public static ArrayList<ArrayList<Integer>> VOT(TreeNode root){

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    
    if(root==null)
        return ans;

    Map<Integer,ArrayList<Integer>> CM = new TreeMap<>();

    VOTH(root,0,0,CM);

    for(ArrayList<Integer> list : CM.values()){
        ans.add(list);
    }

    return ans;
}

void VOTH (TreeNode root, int col, int lvl, Map<Integer,ArrayList<Integer>> CM){
    if(root==null)
        return ;

        if (!CM.containsKey(col)) {
            CM.put(col, new ArrayList<>());
        }

        CM.get(col).add(root.val);

        VOTH(root.left, col - 1, lvl + 1, CM);
        VOTH(root.right, col + 1, lvl + 1, CM);
    }
}



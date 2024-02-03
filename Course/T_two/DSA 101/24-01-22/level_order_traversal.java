import java.util.*;
class treedata{
    node root;
    int hd;
    treedata(node root, int hd){
        this.root = root;
        this.hd = hd;
    }
}
public class level_order_traversal {
    
    public static ArrayList<ArrayList<Integer> > levelOrderTraversal (node root) {

        ArrayList<ArrayList<Integer> > ans = new ArrayList<ArrayList<Integer> >();
        Queue<node> q = new LinkedList<node>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                node curr = q.poll();
                level.add(curr.data);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            ans.add(level);
        }
        return ans;
    }

    public static ArrayList<ArrayList<Integer>> vertical_order_Traversal(node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (root == null) return ans;
        
        Queue<treedata> q = new LinkedList<treedata>();
        
        q.add(new treedata(root, 0));
        
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
        
        while (!q.isEmpty()) {
            
            treedata curr = q.poll();
            
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, new ArrayList<Integer>());
            }
            
            map.get(curr.hd).add(curr.root.data);
            
            if (curr.root.left != null) q.add(new treedata(curr.root.left, curr.hd - 1));
            
            if (curr.root.right != null) q.add(new treedata(curr.root.right, curr.hd + 1));
        }
        
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        
        return ans;
    }


    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] in = {4, 2, 5, 1, 6, 3, 7};
        node root = construct_binarytree.constructTree(pre, in);
        ArrayList<ArrayList<Integer> > ans = levelOrderTraversal(root);
        for (ArrayList<Integer> level : ans) {
            for (int node : level) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}


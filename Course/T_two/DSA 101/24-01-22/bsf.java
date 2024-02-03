import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class treenode
{
    int data;
    treenode left;
    treenode right;
    treenode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class bsf {

    public static ArrayList<ArrayList<Integer>> bsf(treenode root)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        if(root==null)
        {
            return ans;
        }

        Queue<treenode> q = new LinkedList<treenode>();

        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<Integer>();
            for(int i=0;i<size;i++)
            {
                treenode curr = q.poll();
                level.add(curr.data);
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
    
}

// import java.lang.reflect.ArrayList;
// import java.util.ArrayList;

import java.util.*;

// tree node class
class treenode {
    int data;
    treenode left;
    treenode right;
    treenode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
// traversal functions

// 1
   void preorder (treenode root)
   {
         if(root == null)
         return;
         System.out.print(root.data + " ");
         preorder(root.left);
         preorder(root.right);
   }

// 2
    void inorder (treenode root)
    {
            if(root == null)
            return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
    }
    
// 3
    void postorder (treenode root)
    {
            if(root == null)
            return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
    }

    ArrayList<Integer> dfs (treenode root)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(root == null)
        return ans;
        Stack<treenode> st = new Stack<treenode>();
        st.push(root);
        while(!st.isEmpty())
        {
            treenode temp = st.pop();
            ans.add(temp.data);
            if(temp.right != null)
            st.push(temp.right);
            if(temp.left != null)
            st.push(temp.left);
        }
        return ans;
    }
}
class q1 {
    
}
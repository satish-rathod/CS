class TN {
    int val;
    TN left, right;

    public TN(int x) {
        val = x;
        left = right = null;
    }
}

 class p1 {

    public int solve(TN A, TN B) {
        if (A == null && B == null) {
            return 0;
        }

        if (A == null || B == null) {
            return -1;
        }

        if (A.val != B.val) {
            return -1;
        }

        int leftOperations = solve(A.left, B.left);
        int rightOperations = solve(A.right, B.right);

        if (leftOperations == -1 || rightOperations == -1) {
            return -1;
        }

        if (A.left != B.left && A.right != B.right) {
            return leftOperations + rightOperations + 1;
        } else if (A.left != B.left || A.right != B.right) {
            return leftOperations + rightOperations + 1;
        }

        return leftOperations + rightOperations;
    }

    public static void main(String[] args) {
        TN A = new TN(1);
        A.left = new TN(2);
        A.right = new TN(3);
        A.left.left = new TN(5);

        TN B = new TN(1);
        B.right = new TN(2);
        B.left = new TN(3);
        B.right.right = new TN(5);

        System.out.println(new p1().solve(A, B));
    }
}

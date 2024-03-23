import java.util.Scanner;

public class SegmentTree {

    private long[] tree;
    private long[] lazy;
    private long[] arr;
    private int MOD;

    public SegmentTree(long[] input, int m) {
        arr = input;
        MOD = m;
        int n = input.length;
        tree = new long[4 * n];
        lazy = new long[4 * n];
        buildTree(1, 0, n - 1);
    }

    private void buildTree(int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            buildTree(2 * node, start, mid);
            buildTree(2 * node + 1, mid + 1, end);
            tree[node] = (tree[2 * node] * tree[2 * node + 1]) % MOD;
        }
    }

    private void lazyUpdate(int node, int start, int end) {
        if (lazy[node] != 1) {
            tree[node] = (tree[node] * lazy[node]) % MOD;
            if (start != end) {
                lazy[2 * node] = (lazy[2 * node] * lazy[node]) % MOD;
                lazy[2 * node + 1] = (lazy[2 * node + 1] * lazy[node]) % MOD;
            }
            lazy[node] = 1;
        }
    }

    public long query(int l, int r) {
        if (l > r || l < 0 || r >= arr.length) {
            throw new IllegalArgumentException("Invalid query range");
        }
        return queryRange(1, 0, arr.length - 1, l, r);
    }

    private long queryRange(int node, int start, int end, int l, int r) {
        lazyUpdate(node, start, end);
        if (start > end || start > r || end < l) return 1;
        if (start >= l && end <= r) return tree[node] % MOD;
        int mid = (start + end) / 2;
        long p1 = queryRange(2 * node, start, mid, l, r);
        long p2 = queryRange(2 * node + 1, mid + 1, end, l, r);
        return (p1 * p2) % MOD;
    }

    public void update(int l, int r, long val) {
        if (l > r || l < 0 || r >= arr.length) {
            throw new IllegalArgumentException("Invalid update range");
        }
        updateRange(1, 0, arr.length - 1, l, r, val);
    }

    private void updateRange(int node, int start, int end, int l, int r, long val) {
        lazyUpdate(node, start, end);
        if (start > end || start > r || end < l) return;
        if (start >= l && end <= r) {
            tree[node] = (tree[node] * val) % MOD;
            if (start != end) {
                lazy[2 * node] = (lazy[2 * node] * val) % MOD;
                lazy[2 * node + 1] = (lazy[2 * node + 1] * val) % MOD;
            }
            return;
        }
        int mid = (start + end) / 2;
        updateRange(2 * node, start, mid, l, r, val);
        updateRange(2 * node + 1, mid + 1, end, l, r, val);
        tree[node] = (tree[2 * node] * tree[2 * node + 1]) % MOD;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        String str = scanner.next();

        SegmentTree st = new SegmentTree(a, m);

        int left = -1;
        int right = n;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'L') {
                left++;
            } else {
                right--;
            }
        }

        StringBuilder res = new StringBuilder();
        long prod = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == 'L' && left >= 0) {
                prod *= a[left--];
                res.insert(0, prod % m + " ");
                prod %= m;
            }
            if (str.charAt(i) == 'R' && right <= n - 1) {
                prod *= a[right++];
                res.insert(0, prod % m + " ");
                prod %= m;
            }
        }

        System.out.println(res);
    }
}

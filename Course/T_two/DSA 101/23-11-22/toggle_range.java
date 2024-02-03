
public class toggle_range {

        public static int toggle(int n, int l, int r) {
            int mask = ((1 << (r - l + 1)) - 1) << l;
            return n ^ mask;
        }
}

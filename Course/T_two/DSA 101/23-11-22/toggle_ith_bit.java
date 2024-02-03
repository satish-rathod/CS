class toggle_ith_bit {
    
    public static int toggle(int n, int i) {
        int mask = 1 << i;
        return n ^ mask;
    }
}
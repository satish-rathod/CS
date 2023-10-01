public class Product_except_self {
    
    public static int[] product(int[] A) {
        int[] prefix = new int[A.length];
        prefix[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            prefix[i] = prefix[i - 1] * A[i];
        }
        int[] suffix = new int[A.length];
        suffix[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * A[i];
        }
        int[] product = new int[A.length];
        product[0] = suffix[1];
        product[A.length - 1] = prefix[A.length - 2];
        for (int i = 1; i < A.length - 1; i++) {
            product[i] = prefix[i - 1] * suffix[i + 1];
        }
        return product;
    }
}

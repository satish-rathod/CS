public class Hashing {

    public static int valid_path(String A) {
        int count = 0;

        int[] countG = new int[A.length()];

        for (int i = A.length() - 2; i >= 0; i--) {
            if (A.charAt(i) == 'g') {
                countG[i] = countG[i + 1] + 1;
            } else {
                countG[i] = countG[i + 1];
            }
        }

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a') {
                count += countG[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "ababgbgga";
        System.out.println(valid_path(A)); // Output: 6
    }
}

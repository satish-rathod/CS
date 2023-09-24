import java.util.*;
public class colourfull_numbers {

    public static int is_colourfull(int A) {
        String str = Integer.toString(A);
        int len = str.length();

        HashSet<Integer> set = new java.util.HashSet<Integer>();

        for (int i = 0; i < len; i++) {
            int prod = 1;
            for (int j = i; j < len; j++) {
                //
                prod *= Integer.parseInt(str.substring(j, j+1));
                if (set.contains(prod)) {
                    return 0;
                }
                set.add(prod);
            }
        }
        return 1;
    }
}

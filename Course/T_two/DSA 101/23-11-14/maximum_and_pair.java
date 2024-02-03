import java.util.ArrayList;

public class maximum_and_pair {

    public static int max_pair_and(ArrayList<Integer> A) {
        int max = -1;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int temp = A.get(i) & A.get(j);
                if (temp > max)
                    max = temp;
            }
        }

        return -1;
    }

}   


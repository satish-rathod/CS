import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class top_K_occurance {

      public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        Collections.sort(entryList, (a, b) -> b.getValue().compareTo(a.getValue()));

        int ans[] = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = entryList.get(i).getKey();
        }

        return ans;
    }
    
}
import java.util.ArrayList;
import java.util.HashMap;

public class grouped_annagram {

    public static ArrayList<ArrayList<Integer>> group(ArrayList<String> words) {
        ArrayList<ArrayList<Integer>> groups = new ArrayList<ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            char[] arr = word.toCharArray();
            java.util.Arrays.sort(arr);
            String sorted = new String(arr);
            if (map.containsKey(sorted)) {
                ArrayList<Integer> list = map.get(sorted);
                list.add(i);
                map.put(sorted, list);
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(sorted, list);
            }
        }
        
        for (String key : map.keySet()) {
            groups.add(map.get(key));
        }

        return groups;
    }

   
}


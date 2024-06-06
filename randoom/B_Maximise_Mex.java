import java.util.*;

class Pair{
    int key;
    int value;
    Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class B_Maximise_Mex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector
        int t = scanner.nextInt();
        
        for (int I = 0; I < t; I++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }else{
                    map.put(x, 1);
                }
            } // nlog n

            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
                public int compare(Pair a, Pair b) {
                    if (a.value != b.value) return b.value - a.value;
                    return b.key - a.key;
                }
            }); 

            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                pq.add(new Pair(entry.getKey(), entry.getValue()));
            } // nlog n

            int index = 0;
            int mex = 0;
            
            while(k>0 && index<n){

                if(map.containsKey(mex))
                {
                    map.put(mex, map.get(mex) - 1);
                    if(map.get(mex) == 0){
                        map.remove(mex);
                    }

                }
                else{
                    k--;
                    Pair p = pq.peek();
                    pq.poll();
                    if(p.value > 1){
                        p.value--;
                        pq.add(p);
                    }
                    else{
                        map.remove(p.key);
                    }

                    
                }
                mex++;
                index++;
            }//k*logn

            while(map.containsKey(mex)){
                mex++;
            } // n 
            
            System.out.println(mex);
    } 
}
}
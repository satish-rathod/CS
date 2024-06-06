import java.util.*;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        
        while (t-- > 0) {

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int ans = 0;
        List<Integer> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        Collections.sort(a);
        for (int i = 0; i < n; i++) {
            if (k >= m) {
                ans += (i * m + a.get(i)) * m;
                k -= m;
            } else {
                ans += (i * m + a.get(i)) * k;
                break;
            }
        }
        System.out.println(ans);
        
    }
}

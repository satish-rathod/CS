package randoom;
import java.util.Scanner;
import java.util.Stack;

public class B_YetnotherrokenKeoard{

    static boolean isUpp(char c) {
        return c >= 'A' && c <= 'Z';
    }

    static boolean isLow(char c) {
        return c >= 'a' && c <= 'z';
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        Stack<Pair<Integer, Character>> u = new Stack<>();
        Stack<Pair<Integer, Character>> l = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'B') {
                if (!u.isEmpty())
                    u.pop();
            }
            if (c == 'b') {
                if (!l.isEmpty())
                    l.pop();
            }
            if (isUpp(c) && c != 'B') {
                u.push(new Pair<>(i, c));
            }
            if (isLow(c) && c != 'b') {
                l.push(new Pair<>(i, c));
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!u.isEmpty() && !l.isEmpty()) {
            if (u.peek().getFirst() > l.peek().getFirst()) {
                ans.append(u.pop().getSecond());
            } else {
                ans.append(l.pop().getSecond());
            }
        }
        while (!u.isEmpty()) {
            ans.append(u.pop().getSecond());
        }
        while (!l.isEmpty()) {
            ans.append(l.pop().getSecond());
        }
        System.out.println(ans.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    static class Pair<F, S> {
        private F first;
        private S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }
    }
}

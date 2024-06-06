import java.util.*;

public class D_Ingenuity_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            String result = solve(n, s);
            System.out.println(result);
        }
    }
    
    private static String solve(int n, String s) {
        int numN = 0, numS = 0, numE = 0, numW = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == 'N') numN++;
            else if (ch == 'S') numS++;
            else if (ch == 'E') numE++;
            else if (ch == 'W') numW++;
        }
        
        boolean NS = (numN > 0 && numS == 0 || numN == 0 && numS > 0);
        boolean EW = (numE > 0 && numW == 0 || numE == 0 && numW > 0);

        if(NS && EW) return "NO";
        
        StringBuilder result = new StringBuilder(s);
        boolean roverMovedX = false, helicopterMovedX = false;
        boolean roverMovedY = false, helicopterMovedY = false;
        int roverX = 0, roverY = 0;
        int helicopterX = 0, helicopterY = 0;

        for (int i = 0; i < n; i++) {
            char move = s.charAt(i);
            if (move == 'N') {
                if (helicopterY == 0 && !helicopterMovedY) {
                    result.setCharAt(i, 'H');
                    helicopterMovedY = true;
                    helicopterY++;
                } else {
                    result.setCharAt(i, 'R');
                    roverMovedY = true;
                    roverY++;
                }
            } else if (move == 'S') {
                if (helicopterY == 0 && !helicopterMovedY) {
                    result.setCharAt(i, 'H');
                    helicopterMovedY = true;
                    helicopterY--;
                } else {
                    result.setCharAt(i, 'R');
                    roverMovedY = true;
                    roverY--;
                }
            } else if (move == 'E') {
                if (helicopterX == 0 && !helicopterMovedX) {
                    result.setCharAt(i, 'H');
                    helicopterMovedX = true;
                    helicopterX++;
                } else {
                    result.setCharAt(i, 'R');
                    roverMovedX = true;
                    roverX++;
                }
            } else if (move == 'W') {
                if (helicopterX == 0 && !helicopterMovedX) {
                    result.setCharAt(i, 'H');
                    helicopterMovedX = true;
                    helicopterX--;
                } else {
                    result.setCharAt(i, 'R');
                    roverMovedX = true;
                    roverX--;
                }
            }
        }

        if (roverX == helicopterX && roverY == helicopterY && roverMovedX && helicopterMovedX && roverMovedY && helicopterMovedY) {
            return result.toString();
        } else {
            return "NO";
        }
    }
}

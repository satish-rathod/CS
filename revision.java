import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class revision {

    public int power(int a, int b) {
        // Calculate a^b using recursion
        if (b == 0) {
            return 1;
        }
        int temp = power(a, b / 2);
        if (b % 2 == 0) {
            return temp * temp;
        } else {
            return a * temp * temp;
        }
    }

    public void towerofhanoi(int n, char from, char to, char aux) {
        // Print the steps to move n disks from 'from' to 'to' using 'aux'
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        towerofhanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        towerofhanoi(n - 1, aux, to, from);
    }

    
    String[] char = ["", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"];
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        backtrack(result, digits, "", 0);
        return result;
    }
    
    public void backtrack(List<String> result, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = char[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            backtrack(result, digits, current + letters.charAt(i), index + 1);
        }
    }
    
}

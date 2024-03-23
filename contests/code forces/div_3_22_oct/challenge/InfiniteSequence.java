import java.util.Scanner;

public class InfiniteSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long k = scanner.nextLong();
            long result = getDigitAtPosition(k);
            System.out.println(result);
        }
        
        scanner.close();
    }
    
    public static long getDigitAtPosition(long k) {
        long length = 0;
        long sum = 0;
        long count = 1;
        
        while (true) {
            length = count;
            sum += length;
            if (sum >= k) {
                break;
            }
            count++;
        }
        
        long positionInBlock = k - (sum - length);
        
        if (positionInBlock == 0) {
            return length;
        }

        return positionInBlock;
    }
}

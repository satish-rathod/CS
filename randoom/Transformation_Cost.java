import java.util.*;

class Transformation_Cost {

    public static int binaryToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        return binary.toString();
    }

    public static int leftmostZeroIndex(String binaryString) {
        int index = -1;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '0') {
                index = i;
                break;
            }
        }
        return index;
    }

    public static String setBinaryAtIndex(int num, int index) {
        StringBuilder binary = new StringBuilder(decimalToBinary(num));
        for (int i = index + 1; i < binary.length(); i++) {
            binary.setCharAt(i, '0');
        }
        binary.setCharAt(index, '1');
        return binary.toString();
    }

    public static boolean val (String s)
    {
        boolean flag = true;
        int first = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '0')
            {
                first = i;
                break;
            }
        }

        for(int i = first; i < s.length(); i++)
        {
            if(s.charAt(i) == '1')
            {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        while (test-- > 0) {
            int num = sc.nextInt();

            if(val(decimalToBinary(num)))
            {
                System.out.println(0);
                continue;
            }
            int leftindex = leftmostZeroIndex(decimalToBinary(num));
            // System.out.println(leftindex+" "+ num+" "+ decimalToBinary(num));
            if(leftindex == -1){
                System.out.println(0);
                continue;
            }
            int ans = binaryToDecimal(setBinaryAtIndex(num, leftindex))-num;
            System.out.println(ans);
        }
    }
}

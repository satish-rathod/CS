class binaryadder {
    
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        String ans = "";
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum += b.charAt(j)-'0';
                j--;
            }
            ans = (sum%2) + ans;
            carry = sum/2;
        }
        if(carry!=0){
            ans = carry + ans;
        }
        return ans;
    }
}
//10XOR13 = 7
//sss
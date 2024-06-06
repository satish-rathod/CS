public class Solution {
    
    public boolean check (String A, String B, String C, int i, int j, int k)
    {
        if(k==C.length() && i==A.length() && j==B.length() ) return true;
        
        if(i<A.length() && A.charAt(i)==C.charAt(k))
        {
             if(check(A,B,C,i+1,j,k+1))
             {
                 return true;
             }
        }
        
        if(j<B.length() && B.charAt(j)==C.charAt(k))
        {
            if(check(A,B,C,i,j+1,k+1))
             {
                 return true;
             }
        }
        
        return false;
    }
    
    public int isInterleave(String A, String B, String C) {
        if(C.length()!=A.length()+B.length()) return 0;
        return check(A,B,C,0,0,0)?1:0;
    }
}

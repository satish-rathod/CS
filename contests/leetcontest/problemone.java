class Solution {
    public int minChanges(String s) {

        if(s.length() == 1)
        {
            return 0;
        }

        if(s.length() == 2)
        {
            if(s.charAt(0) == s.charAt(1))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }

        
        int opp = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(i%2 == 0)
            {
                if(s.charAt(i) == '0')
                {
                    opp++;
                }
            }
            else
            {
                if(s.charAt(i) == '1')
                {
                    opp++;
                }
            }
        }

        int opp1 = 0;

        for(int i=0; i<s.length(); i++)
        {
            if(i%2 == 0)
            {
                if(s.charAt(i) == '1')
                {
                    opp1++;
                }
            }
            else
            {
                if(s.charAt(i) == '0')
                {
                    opp1++;
                }
            }
        }

        return Math.min(opp, opp1);
        
    }
}
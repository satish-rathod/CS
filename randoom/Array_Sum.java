package randoom;
class Array_Sum {
    
    //ispossible
    public static boolean ispossible(int nums, int sum)
    {
        if(nums==1)
        {
            return true;
        }
        if(sum%2!=0)
        {
            return false;
        }
        int half=sum/2;
        if(nums<half)
        {
            return false;
        }
        return true;
    }
    //if possible return arr
    
}
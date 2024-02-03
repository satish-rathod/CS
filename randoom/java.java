package randoom;
class Solution {

    public static boolean check (int []nums, int mid, int target)
    {
        int len = nums.length;

        for(int i=mid;i<len;i++)
        {
            if(nums[i]-nums[i-mid]>=target)
            {
                return true;
            }
        }

        return false;
    }

    public int minSubArrayLen(int target, int[] nums) {

        int len = nums.length;

        for(int i=1;i<len;i++)
        {
            nums[i]+=nums[i-1];
        }

        int s=0,e=len;
        int ans=0;

        while(s<=e)
        {
            int mid = s+(e-s)/2;

            if(check(nums,mid,target))
            {
                e=mid-1;
                ans=mid; 
            }
            else
            {
                s= mid+1;
            }

        }

        return ans;
        
    }

    public static void main(String[] args) {
        
    }
}
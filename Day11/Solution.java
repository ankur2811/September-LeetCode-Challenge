class Solution {
    public int maxProduct(int[] nums) {
        int maxarr=-(int)1e8;
        int curr=1;
        for(int i=0;i<nums.length;i++)
        {
            curr*=nums[i];
            maxarr=Math.max(curr,maxarr);
            if(nums[i]==0)
                curr=1;
        }
        curr=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            curr*=nums[i];
            maxarr=Math.max(curr,maxarr);
            if(nums[i]==0)
                curr=1;
        }
        
        return maxarr;
    }
}
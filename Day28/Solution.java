class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0;
        int count=0;
        int sum=1;
        while(i<nums.length)
        {
            sum*=nums[i];
           
            while(j<=i && sum>=k )
            {
                sum/=nums[j];
                j++;
            }
           
            count+=i-j+1;
            i++;
        }
       
        return count;
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            if(nums[i]!=i+1 && nums[i]>0 && nums[i]<n)
            {
                if(nums[nums[i]-1]==nums[i])
                    i++;
                else{
                int a=nums[i];
                int b=nums[a-1];
                nums[a-1]=nums[i];
                nums[i]=b;}
            }
           
            else
            i++;
        }
        int ans=0;
        
        for(int l=0;l<n;l++)
        {
            if(nums[l]!=l+1){
                return l+1;
                
            }
            else
                ans++;
        }
        return ans+1;
        
    }
}

class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0,mask=0;
        for(int i=31;i>=0;i--)
        {
            mask=mask|(1<<i);
            Set<Integer> hs=new HashSet<>();
            for(int num:nums)
            {
                hs.add(mask&num);
            }
            
            int temp=max|(1<<i);
            for(int prefix:hs)
            {
                if(hs.contains(temp^prefix)){
                    max=temp;
                    break;
                }
            }
        }
        
        return max;
    }
}
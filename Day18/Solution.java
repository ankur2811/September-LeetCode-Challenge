class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        
        int t0=0;
        int t1=-(int)1e9;
        for(int ele:prices)
        {
            t0=Math.max(t0,t1+ele);
            t1=Math.max(t1,0-ele);
        }
        
        return t0;
    }
}
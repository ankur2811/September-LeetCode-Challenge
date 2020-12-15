class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time=0,ans=0;
        for(int i=0;i<timeSeries.length;i++)
        {
            if(time>timeSeries[i])
            {
                if(duration-(time-timeSeries[i])>0)
                ans+=duration-(time-timeSeries[i]);
            }
            else
                ans+=duration;
            
            time=timeSeries[i]+duration;
        }
        
        return ans;
    }
}
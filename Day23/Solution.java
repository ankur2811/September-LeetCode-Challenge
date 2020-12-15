class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int extragas=0;
        int sp=0;
        int deficit=0;
        for(int i=0;i<gas.length;i++)
        {
            extragas+=gas[i]-cost[i];
            if(extragas<0)
            {
                deficit+=extragas;
                sp=i+1;
                extragas=0;
            }
        }
        
        return (sp==gas.length||deficit+extragas<0)?-1:sp;
    }
}
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ls=new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0])
        {
            ls.add(intervals[i]);
            i++;
        }
        
         while(i<intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
         int[] temp = new int[2];
        temp[0] = newInterval[0];
        temp[1] = newInterval[1];
        ls.add(temp);
        
         while(i<intervals.length) {
            ls.add(intervals[i]);
            i++;
        }
        return ls.toArray(new int[ls.size()][2]);
    }
}
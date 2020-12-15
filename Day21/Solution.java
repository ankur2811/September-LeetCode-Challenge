class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int size=0;
        for(int i=0;i<trips.length;i++)
        {
            size=(size>=trips[i][2])?size:trips[i][2];
        }
        
        int arr[]=new int[size+1];
        for(int i=0;i<trips.length;i++)
        {
            arr[trips[i][1]]+=trips[i][0];
            arr[trips[i][2]]-=trips[i][0];
        
        }
        
        for(int i=1;i<=size;i++)
        {
            arr[i]+=arr[i-1];
            if(arr[i]>capacity)
                return false;
        }
        return true;
    }
}
class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int ans=0;
        int rows=img1.length;
        for(int i=1-rows;i<rows;i++)
            for(int j=1-rows;j<rows;j++)
                ans=Math.max(ans,overlap(img1,img2,i,j));
        
        return ans;
    }
    
    public int overlap(int[][] img1,int[][] img2,int a,int b)
    {
        int n=img1.length;
        
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i + a< 0 || i + a >= n|| j + b < 0 || j+b >= n)
                    continue;
                if(img1[i][j]+img2[i+a][j+b]>1)
                    count++;
            }
        }
        
        return count;
        
    }
}
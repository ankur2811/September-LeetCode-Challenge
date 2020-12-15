class Solution {
    int[][] dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public int uniquePathsIII(int[][] grid) {
        if(grid.length==0 || grid[0].length==0)
        {
            return 0;
        }
        int n=grid.length;
        int m=grid[0].length;
        int sr=0,sc=0,er=0,ec=0,count=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
              if(grid[i][j]==1) 
              {
                  sr=i;
                  sc=j;
                  count++;
              }
                else if(grid[i][j]==2)
                {
                    er=i;
                    ec=j;
                    count++;
                }
                else if(grid[i][j]==0)
                    count++;
                
            }
        
        boolean[][] vis=new boolean[n][m];
        vis[sr][sc]=true;
        return unique(sr,sc,er,ec,grid,vis,count-1);
        
    }
    
    public int unique (int sr,int sc,int er,int ec,int[][] grid,boolean[][] vis,int co)
    {
        if(sr==er && sc==ec)
            return co==0?1:0;
        int count=0;
        for(int i=0;i<4;i++)
        {
            int r=sr+dir[i][0];
            int c=sc+dir[i][1];
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && vis[r][c]==false && grid[r][c]!=-1)
            {
                vis[r][c]=true;
                count+=unique(r,c,er,ec,grid,vis,co-1);
                vis[r][c]=false;
            }
            
        }
        
        return count;
        
        
        
        
        
    }
}
class Solution {
    public String largestTimeFromDigits(int[] A) {
        String ans="";
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++)
                {
                    if(i==j || j==k || i==k)
                        continue;
                    
                    String hh=A[i]+""+A[j];
                    String mm=A[k]+""+A[6-i-j-k];
                    String time=hh+":"+mm;
                    if(hh.compareTo("24")<0 && mm.compareTo("60")<0 && time.compareTo(ans)>0)
                        ans=time;
                }
            }
        }
        return ans;
    }
}
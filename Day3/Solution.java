class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                int r=n/i;
                String temp=s.substring(0,i);
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<r;j++)
                    sb.append(temp);
                
                if(sb.toString().equals(s))
                    return true;
            }
        }
        
        return false;
    }
}
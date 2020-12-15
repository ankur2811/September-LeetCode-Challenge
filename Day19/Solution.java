class Solution {
    List<Integer> ans=new ArrayList<>();
       
   public List<Integer> sequentialDigits(int low, int high) {
     
       for(int i=1;i<=9;i++)
       sequence(i,low,high);
       Collections.sort(ans);
       return ans;
   }
   
   public void sequence(int n,int low,int high)
   {
       if(n>high)
           return ;
       if(n>=low)
           ans.add(n);
       
       int k=n%10;
       if(k==9)
           return;
          sequence(n*10+k+1,low,high);
       
           
   }
       
}
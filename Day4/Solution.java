class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ans=new ArrayList<>();
        int n=S.length();
        //t i=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int j=n-1;j>=0;j--)
        {
            if(!(hs.containsKey(S.charAt(j))))
            hs.put(S.charAt(j),j);
        }
            
        int pi=0;
        int i=0;
        int p=0;
        while(i<n)
        {
        while(i<=pi)
        {
            int k=hs.get(S.charAt(i));
            pi=Math.max(pi,k);
            i++;
            p++;
        }
            ans.add(p);
            p=0;
            pi=i;
            
        }
        return ans;
    }
}
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ls= new ArrayList<>();
        List<Integer> small= new ArrayList<>();
        solve(k, n,ls,small,1);
        return ls;
    }
    public void solve(int k, int n,List<List<Integer>> ls,List<Integer> small,int idx)
    {
        if(n==0 && small.size()==k)
        {
            List<Integer> nu=new ArrayList<>(small);
            ls.add(nu);
        }
        for(int i=idx;i<=9;i++)
        {
            if(n-i>=0)
            {
                small.add(i);
                solve(k, n-i,ls,small,i+1);
                small.remove(small.size()-1);
            }
        }
    }
}
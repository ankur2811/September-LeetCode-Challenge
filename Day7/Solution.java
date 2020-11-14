class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap<>();
        HashSet<String> used=new HashSet<>();
        String[] words = s.split(" ");
       
        
        int n=words.length;
        if(n!=pattern.length())
            return false;
        for(int i=0;i<n;i++)
        {
            char ch=pattern.charAt(i);
            if(!hm.containsKey(ch))
            {
                if(used.contains(words[i])){
                    return false;
                }
                else
                {
                    used.add(words[i]);
                    hm.put(ch,words[i]);
                }
            }
            else {
                if(!hm.get(ch).equals(words[i])){
                    return false;
                }
            }
        }
        
        return true;
    }
}
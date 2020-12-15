class Solution {
    HashSet<String> hs=new HashSet<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s))
            return true;
      if(hs.contains(s))
          return false;
        
        for(String word:wordDict)
        {
            if(s.startsWith(word) && wordBreak(s.substring(word.length()), wordDict)==true) return true;
        }
        hs.add(s);
        return false;
    }
}
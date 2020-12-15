class Solution {
    public char findTheDifference(String s, String t) {
        int[] alpha=new int[26];
        for(int i=0;i<s.length();i++)
            alpha[s.charAt(i)-'a']++;
        
        for(int i=0;i<t.length();i++)
        {
            if(alpha[t.charAt(i)-'a']>0)
                alpha[t.charAt(i)-'a']--;
            else
                return t.charAt(i);
        }
        return ' ';
    }
}
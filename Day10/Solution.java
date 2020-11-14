class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<secret.length();i++)
        {
            char ch=secret.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        int a=0,b=0;
        for(int i=0;i<secret.length();i++)
        {
            char gch=guess.charAt(i);
            if(secret.charAt(i)==gch)
                a++;
           
            
            if(hm.containsKey(gch))
            {
                hm.put(gch,hm.get(gch)-1);
                b++;
                
                if(hm.get(gch)==0)
                    hm.remove(gch);
            
            }
        }
    
        return new String(a+"A"+(b-a)+"B");
    }
}
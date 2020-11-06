/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> a3=new ArrayList<>();
        inorder(root1,a1);
        inorder(root2,a2);
        merge(a1,a2,a3);
        return a3;
    }
    
    public void inorder(TreeNode r1,ArrayList<Integer> a1)
    {
        if(r1==null)
            return ;
    inorder(r1.left,a1);
        a1.add(r1.val);
        inorder(r1.right,a1);
    }
    
    public void merge(ArrayList<Integer> a1,ArrayList<Integer> a2,ArrayList<Integer> ans)
    {
        int idx1=0,idx2=0;
        while(idx1<a1.size() && idx2<a2.size())
        {
            if(a1.get(idx1)<=a2.get(idx2))
            {
                ans.add(a1.get(idx1));
                    idx1++;
            }
            else
            {
               ans.add(a2.get(idx2));
                    idx2++;  
            }
        }   
            while(idx1<a1.size())
            {
                 ans.add(a1.get(idx1));
                    idx1++;
                
            }
             
            while(idx2<a2.size())
            {
                 ans.add(a2.get(idx2));
                    idx2++;
                
            }
        
    }
}
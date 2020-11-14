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
    int ans=0;
    public int sumRootToLeaf(TreeNode root) {
        sum(root,"");
        return ans;
    }
    public void sum(TreeNode root, String str)
    {
       
          if(root==null)
            return;
        if(root.left==null && root.right==null)
        {
           String a=str+root.val;
            System.out.println(a);
            ans+=Integer.parseInt(a,2);
        }
        sum(root.left,str+root.val);
        sum(root.right,str+root.val);
    }
}
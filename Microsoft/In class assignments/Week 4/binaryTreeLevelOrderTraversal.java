class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        traverse(ans,root,0);
        return ans;
    }    
    public void traverse(List<List<Integer>> ans,TreeNode curr,int level)
    {
        if(curr==null) return;
        if(ans.size()==level) 
            ans.add(new ArrayList<Integer>());
        
        ans.get(level).add(curr.val);
        traverse(ans,curr.left,level+1);
        traverse(ans,curr.right,level+1);
    }
}

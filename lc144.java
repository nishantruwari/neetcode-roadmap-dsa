class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> ans=new LinkedList<>();
        if(root==null) return ans;
        stack.push(root);
        while(!stack.empty()){
            root=stack.pop();
            ans.add(root.val);
            if(root.right!=null){
                stack.push(root.right);
            }
            if(root.left!=null){
                stack.push(root.left);
            }
        }
        return ans;
        
    }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node=root;
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> list=new LinkedList<>();
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                node=stack.pop();
                list.add(node.val);
                node=node.right;
            }
        }
        return list;

        
    }
}
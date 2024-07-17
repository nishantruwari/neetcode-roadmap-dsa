class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root==null){
        return ans;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> subans = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                subans.add(q.poll().val);

            }
            ans.add(subans);

        }
        return ans;

    }
}
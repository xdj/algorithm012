class Solution {
	public List< Integer > inorderTraversal(TreeNode root) {
        List< Integer > result = new ArrayList<>();
        TreeNode current = root;
        Deque< TreeNode > stack = new LinkedList<>();

        while( null != current || !stack.isEmpty()){
            while( null != current) {
                stack.push( current );
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
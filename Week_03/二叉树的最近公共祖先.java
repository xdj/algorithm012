
public class LowestCommonAncestor {

    private TreeNode ans;

    private boolean dfs(TreeNode root,TreeNode p,TreeNode q){
        if(null == root){
            return false;
        }
        boolean lson = dfs(root.left,p,q);
        boolean rson = dfs(root.right,p,q);
        if((lson && rson) ||
                ( (root.val == p.val ||root.val == q.val) && (lson || rson) )){
            ans = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        this.dfs(root,p,q);
        return ans;
    }
}

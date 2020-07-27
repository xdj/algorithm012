import java.util.HashMap;
import java.util.Map;

public class BuildTreeSolution {

    private Map<Integer,Integer> inOrderMap;

    public TreeNode myBuildTree(int[] preOrder,int[] inOrder,int preOrderFirst,int preOrderLast,
                                int inOrderFirst, int inOrderLast){
        if(preOrderFirst > preOrderLast){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[preOrderFirst]);
        int inOrderRootLocation = inOrderMap.get(root.val);
        int leftTreeSize = inOrderRootLocation-inOrderFirst;
        int preOrderLeftLast = preOrderFirst + leftTreeSize;
        root.left=myBuildTree(preOrder,inOrder,preOrderFirst+1,preOrderLeftLast,
                inOrderFirst,inOrderRootLocation-1);
        root.right=myBuildTree(preOrder,inOrder,preOrderLeftLast+1,preOrderLast,
                inOrderRootLocation+1,inOrderLast);
        return root;
    }

    public TreeNode buildTree(int[] preorder,int[] inorder){
        int n = preorder.length;
        inOrderMap = new HashMap<>();

        for(int i=0; i<n; i++){
            inOrderMap.put(inorder[i],i);
        }
        return myBuildTree(preorder, inorder, 0,n-1,0,n-1);
    }
}

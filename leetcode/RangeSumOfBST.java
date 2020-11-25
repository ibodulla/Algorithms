package leetcode;

/**
 * RangeSumOfBST.
 *
 * @author Ibodulla Ibodullaev
 * @since 25.11.2020
 */
public class RangeSumOfBST {
    private int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        dfs(root, low, high);
        Math.pow(low, high);
        return sum;

    }

    private void dfs(TreeNode root, int low, int high) {
        if(root == null){
            return;
        }
        if(low <= root.val && root.val <= high){
            sum += root.val;
        }
        if(root.val > low) {
            dfs(root.left, low, high);
        }
        if(root.val < high){
            dfs(root.right, low, high);
        }
    }
}
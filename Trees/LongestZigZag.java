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
class LongestZigZag {
    public int longestZigZag(TreeNode root) {
        
        int left = iterate(root.left, 0, 1);
        int right = iterate(root.right, 1, 1);

        return Math.max(left, right);
    }

    public int iterate(TreeNode root, int direction, int val) {
        if(root == null) {
            return val - 1;
        }

        int left = 0;
        int right = 0;

        if (direction == 0) {
            left = iterate(root.left, 0, 1);
            right = iterate(root.right, 1, val + 1);
        } else {
            left = iterate(root.left, 0, val + 1);
            right = iterate(root.right, 1, 1);
        }

        left = Math.max(val, left);
        right = Math.max(val, right);

        return Math.max(left, right);
    }
}

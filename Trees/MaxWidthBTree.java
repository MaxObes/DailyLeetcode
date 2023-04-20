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
class Node {
    int index;
    TreeNode node;
    public Node(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}

public class MaxWidthBTree {
    // BFS
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(root, 0));
        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int start = 0;
            int end = 0;

            for (int i = 0; i < size; i++) {
                Node temp = queue.remove();

                if (i == 0) {
                    start = temp.index;
                }

                if (i == size - 1) {
                    end = temp.index;
                }

                /*add left child to the queue */
                if (temp.node.left != null) {
                    queue.add(new Node(temp.node.left, 2*temp.index));
                }

                /*add right right child to the queue */
                if (temp.node.right != null) {
                    queue.add(new Node(temp.node.right, 2*temp.index+1));
                }
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}

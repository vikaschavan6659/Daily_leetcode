/*You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children.*/

import javax.swing.tree.TreeNode;

public class RootOfBinary {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int pathSum) {
        if (node == null)
            return 0;

        pathSum = pathSum * 10 + node.val;

        if (node.left == null && node.right == null)
            return pathSum;

        return dfs(node.left, pathSum) + dfs(node.right, pathSum);
    }
}

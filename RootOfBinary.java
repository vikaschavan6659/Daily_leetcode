/*You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children.*/


import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class RootOfBinary {
    // TreeNode class definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // addOneRow method definition
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        // If depth is 1, create a new root with the given value
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        // Queue for breadth-first traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int curDepth = 1;

        // Traverse the tree
        while (curDepth < depth - 1) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();

                if (cur.left != null) {
                    queue.add(cur.left);
                }
                if (cur.right != null) {
                    queue.add(cur.right);
                }
            }
            curDepth++;
        }

        // Add new nodes at the specified depth
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            TreeNode leftNode = new TreeNode(val);
            leftNode.left = cur.left;
            cur.left = leftNode;

            TreeNode rightNode = new TreeNode(val);
            rightNode.right = cur.right;
            cur.right = rightNode;
        }

        return root;
    }
}

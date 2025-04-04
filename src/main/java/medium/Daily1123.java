package medium;

import data_structures.TreeNode;

public class Daily1123 {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).node;
    }


    DepthOrientedTreeNode dfs(TreeNode node) {
        if (node == null) return new DepthOrientedTreeNode(null, 0);

        var left = dfs(node.left);
        var right = dfs(node.right);

        if (left.height == right.height) return new DepthOrientedTreeNode(node, 1 + left.height);
        else if (left.height > right.height) return new DepthOrientedTreeNode(left.node, left.height + 1);
        return new DepthOrientedTreeNode(right.node, right.height + 1);

    }

    record DepthOrientedTreeNode(TreeNode node, int height) {
    }
}

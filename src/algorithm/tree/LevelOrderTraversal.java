package algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树层序遍历
 * 按照每一层从左向右的方式进行遍历
 *
 * @author xuexiang
 * @since 2021/11/22 10:22 下午
 */
public class LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1)
                .setLeft(new TreeNode(2, new TreeNode(3), new TreeNode(4)))
                .setRight(new TreeNode(5, null, new TreeNode(6)));
        ITraversal traversal = new Traversal2();
        List<List<Integer>> result = traversal.levelOrderTraversal(root);
        System.out.println(result);
    }

    /**
     * 递归算法
     */
    static class Traversal1 implements ITraversal {

        @Override
        public List<List<Integer>> levelOrderTraversal(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            order(res, root, 0);
            return res;
        }

        public void order(List<List<Integer>> result, TreeNode node, int level) {
            if (result == null) {
                result = new ArrayList<>();
            }
            if (result.size() == level) {
                result.add(new ArrayList<>());
            }
            result.get(level).add(node.val);
            if (node.left != null) {
                order(result, node.left, level + 1);
            }
            if (node.right != null) {
                order(result, node.right, level + 1);
            }
        }
    }

    /**
     * 迭代算法
     */
    static class Traversal2 implements ITraversal {

        @Override
        public List<List<Integer>> levelOrderTraversal(TreeNode root) {
            List<List<Integer>> ret = new ArrayList<>();
            if (root == null) {
                return ret;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            // 队列先进先出
            while (!queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int currentLevelSize = queue.size();
                for (int i = 1; i <= currentLevelSize; ++i) {
                    TreeNode node = queue.poll();
                    if (node == null) {
                        continue;
                    }
                    level.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                ret.add(level);
            }
            return ret;
        }
    }

    interface ITraversal {
        /**
         * 层序遍历
         *
         * @param root 根结点
         * @return 遍历结果
         */
        List<List<Integer>> levelOrderTraversal(TreeNode root);
    }
}

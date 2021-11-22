package algorithm.tree;

import java.util.*;

/**
 * 二叉树前（先）序遍历
 *
 * 根节点 -> 左孩子 -> 右孩子
 *
 * @author xuexiang
 * @since 2021/11/22 9:19 下午
 */
public class PreorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1)
                .setLeft(new TreeNode(2, new TreeNode(3), new TreeNode(4)))
                .setRight(new TreeNode(5, null, new TreeNode(6)));
        ITraversal traversal = new Traversal2();
        List<Integer> result = traversal.preorderTraversal(root);
        System.out.println(result);
    }

    /**
     * 递归算法
     */
    static class Traversal1 implements ITraversal {

        @Override
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            order(root, res);
            return res;
        }

        public void order(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            res.add(root.val);
            order(root.left, res);
            order(root.right, res);
        }
    }

    /**
     * 迭代算法
     */
    static class Traversal2 implements ITraversal {

        @Override
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = root;
            while (!stack.isEmpty() || node != null) {
                while (node != null) {
                    // 输出根结点
                    res.add(node.val);
                    // 存下根结点
                    stack.push(node);
                    // 遍历左结点
                    node = node.left;
                }
                // 拿到根结点
                node = stack.pop();
                // 遍历右结点
                node = node.right;
            }
            return res;
        }
    }

    interface ITraversal {
        /**
         * 前序遍历
         *
         * @param root 根结点
         * @return 遍历结果
         */
        List<Integer> preorderTraversal(TreeNode root);
    }

}

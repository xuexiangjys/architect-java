package algorithm.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树后序遍历
 * 左孩子 -> 右孩子 -> 根节点
 *
 * @author xuexiang
 * @since 2021/11/22 10:22 下午
 */
public class BackOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1)
                .setLeft(new TreeNode(2, new TreeNode(3), new TreeNode(4)))
                .setRight(new TreeNode(5, null, new TreeNode(6)));
        ITraversal traversal = new Traversal2();
        List<Integer> result = traversal.backOrderTraversal(root);
        System.out.println(result);
    }

    /**
     * 递归算法
     */
    static class Traversal1 implements ITraversal {

        @Override
        public List<Integer> backOrderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            order(root, res);
            return res;
        }

        public void order(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            order(root.left, res);
            order(root.right, res);
            res.add(root.val);
        }
    }

    /**
     * 迭代算法
     */
    static class Traversal2 implements ITraversal {

        @Override
        public List<Integer> backOrderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Stack<TreeNode> stack = new Stack<>();
            TreeNode node = null;
            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    // 存下根结点
                    stack.push(root);
                    // 遍历左结点
                    root = root.left;
                }
                // 拿到根结点
                root = stack.pop();
                if (root.right != null && root.right != node) {
                    // 存下根结点
                    stack.push(root);
                    // 遍历右结点
                    root = root.right;
                } else {
                    // 输出根结点
                    res.add(root.val);
                    node = root;
                    root = null;
                }
            }
            return res;
        }
    }

    interface ITraversal {
        /**
         * 后序遍历
         *
         * @param root 根结点
         * @return 遍历结果
         */
        List<Integer> backOrderTraversal(TreeNode root);
    }

}

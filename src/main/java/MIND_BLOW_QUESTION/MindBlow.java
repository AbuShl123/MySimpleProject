package MIND_BLOW_QUESTION;

import java.util.ArrayDeque;
import java.util.Deque;

public class MindBlow {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        TreeNode root = createCompleteTree(arr);
        System.out.println(countNodes(root));
        /*
        if to change line 27 to `return h;` line 10 will print 3
        or if to change line 27 to `return leafNodes;` line 10 will print 3.
        but if to change line 27 to `return h+leafNodes;` it will print 11.
        Why ?
         */
    }



    static int h = 0;
    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        h++;
        int leafNodes = countNodes(root.left) + countNodes(root.right);
        return h+leafNodes;
    }

    public static TreeNode createCompleteTree(int[] arr) {
        if (arr == null) return null;
        Deque<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = null;
        for (int v : arr) {
            TreeNode node = queue.peek();
            if (node == null) {
                node = new TreeNode(v);
                root = node;
                queue.offer(node);
            }
            else if (node.left == null) node.left = new TreeNode(v);
            else {
                node.right = new TreeNode(v);
                queue.poll(); queue.offer(node.left); queue.offer(node.right);
            }
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val) {this.val = val;}
}

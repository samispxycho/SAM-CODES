package Dynamic_Programming;

public class HouseRobber3 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }

    public static int rob(TreeNode root) {
        int[] options = travel(root);
        return Math.max(options[0], options[1]);
    }

    private static int[] travel(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int left[] = travel(root.left);
        int right[] = travel(root.right);

        int[] options = new int[2];
        options[0] = root.val + left[1] + right[1];
        options[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return options;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);

        int result = rob(root);
        System.out.println(result);
    }
}
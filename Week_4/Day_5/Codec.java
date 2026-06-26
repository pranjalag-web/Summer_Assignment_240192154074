/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class Codec {

    // Serialize
    public String serialize(TreeNode root) {

        if (root == null) {
            return "N";
        }

        return root.val + "," +
               serialize(root.left) + "," +
               serialize(root.right);
    }

    // Deserialize
    int index = 0;

    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");

        return build(arr);
    }

    public TreeNode build(String[] arr) {

        if (arr[index].equals("N")) {
            index++;
            return null;
        }

        TreeNode root =
            new TreeNode(Integer.parseInt(arr[index]));

        index++;

        root.left = build(arr);
        root.right = build(arr);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));

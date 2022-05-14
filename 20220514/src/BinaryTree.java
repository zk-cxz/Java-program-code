import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-14
 * Time: 20:30
 */
public class BinaryTree {
    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val){
            this.val=val;
        }
    }

    /**
     * 创建一个二叉树，返回根节点
     * @return
     */
    public TreeNode createTree(){
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);
        TreeNode H = new TreeNode(8);

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    /**
     * 前序遍历
     * @param root
     */
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 以数组的形式进行前置遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ret=new ArrayList<>();
        if(root==null){
            return ret;
        }
        ret.add(root.val);
        List<Integer> leftTree=preorderTraversal(root.left);
        ret.addAll(leftTree);
        List<Integer> rightTree=preorderTraversal(root.right);
        ret.addAll(rightTree);
        return ret;
    }
}

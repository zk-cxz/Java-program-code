/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-05-14
 * Time: 20:40
 */
public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BinaryTree.TreeNode root=binaryTree.createTree();
        binaryTree.preOrder(root);
        System.out.println();
        System.out.println(binaryTree.preorderTraversal(root));
    }
}

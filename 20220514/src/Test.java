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
        binaryTree.inOrder(root);
        System.out.println();
        System.out.println(binaryTree.inorderTraversal(root));
        binaryTree.postOrder(root);
        System.out.println();
        System.out.println(binaryTree.postorderTraversal(root));
        binaryTree.size1(root);
        System.out.println(BinaryTree.treeSize);
        System.out.println(binaryTree.size2(root));
        binaryTree.getLeafNodeCount1(root);
        System.out.println(BinaryTree.leafSize);
        System.out.println(binaryTree.getLeafNodeCount2(root));
        System.out.println(binaryTree.getKLevelNodeCount(root, 3));
        System.out.println(binaryTree.getHeight(root));
        System.out.println(binaryTree.find(root, 6).val);
        binaryTree.levelOrder1(root);
        System.out.println();
        System.out.println(binaryTree.levelOrder2(root));
    }
}

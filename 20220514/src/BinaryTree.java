import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    /**
     * 中序遍历
     * @param root
     */
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    /**
     * 以数组的形式进行中序遍历
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ret=new ArrayList<>();
        if(root==null){
            return ret;
        }
        List<Integer> leftTree=inorderTraversal(root.left);
        ret.addAll(leftTree);
        ret.add(root.val);
        List<Integer> rightTree=inorderTraversal(root.right);
        ret.addAll(rightTree);
        return ret;
    }

    /**
     * 后序遍历
     * @param root
     */
    void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    /**
     * 以数组形式进行后序遍历
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ret=new ArrayList<>();
        if(root==null){
            return ret;
        }
        List<Integer> leftTree=postorderTraversal(root.left);
        ret.addAll(leftTree);
        List<Integer> rightTree=postorderTraversal(root.right);
        ret.addAll(rightTree);
        ret.add(root.val);
        return ret;
    }

    /**
     * 获取树中的节点个数--以遍历思想
     * @param root
     */
    public static int treeSize=0;

    public void size1(TreeNode root){
        if(root==null){
            return;
        }
        treeSize++;
        size1(root.left);
        size1(root.right);
    }

    /**
     * 获取树中的节点个数--以子问题思想
     * @param root
     */
    public int size2(TreeNode root){
        if(root==null){
            return 0;
        }
        return size2(root.left)+size2(root.right)+1;
    }

    /**
     * 获取叶子节点个数--遍历思想
     * @param root
     */
    public static int leafSize=0;

    public void getLeafNodeCount1(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            leafSize++;
        }
        getLeafNodeCount1(root.left);
        getLeafNodeCount1(root.right);
    }

    /**
     * 获取叶子节点个数--子问题思想
     * @param root
     * @return
     */
    public int getLeafNodeCount2(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return getLeafNodeCount2(root.left)+getLeafNodeCount2(root.right);
    }

    /**
     *获取第K层节点的个数
     * @param root
     * @param k
     * @return
     */
    public int getKLevelNodeCount(TreeNode root,int k){
        if(root==null){
            return 0;
        }
        if(k==1){
            return 1;
        }
        return getKLevelNodeCount(root.left,k-1)+getKLevelNodeCount(root.right,k-1);
    }

    /**
     * 获取二叉树的深度
     * @param root
     * @return
     */
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }

    /**
     * 判断val值是否在二叉树中存在
     * @param root
     * @param val
     * @return
     */
    public TreeNode find(TreeNode root, int val){
        if(root==null){
            return null;
        }
        if(root.val==val){
            return root;
        }
        TreeNode ret=find(root.left,val);
        if(ret!=null){
            return ret;
        }
        ret=find(root.right,val);
        if(ret!=null){
            return ret;
        }
        return null;
    }

    /**
     * 层序遍历
     * @param root
     */
    public void levelOrder1(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tmp= queue.poll();
            System.out.print(tmp.val+" ");
            if(tmp.left!=null){
                queue.offer(tmp.left);
            }
            if(tmp.right!=null){
                queue.offer(tmp.right);
            }
        }
    }

    /**
     * 使用二维数组来对层序遍历进行分组
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder2(TreeNode root){
        List<List<Integer>> ret=new ArrayList<>();
        if(root==null){
            return ret;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size= queue.size();
            while(size>0) {
                TreeNode tmp=queue.poll();
                list.add(tmp.val);
                size--;
                if(tmp.left!=null){
                    queue.offer(tmp.left);
                }
                if(tmp.right!=null){
                    queue.offer(tmp.right);
                }
            }
            ret.add(list);
        }
        return ret;
    }
}

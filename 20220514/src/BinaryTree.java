import java.util.*;

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
     * 非递归进行前序遍历
     * @param root
     */
    public void preOrder2(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode tmp=stack.pop();
            System.out.print(tmp.val+" ");
            if(tmp.right!=null){
                stack.push(tmp.right);
            }
            if(tmp.left!=null) {
                stack.push(tmp.left);
            }
        }
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
     * 非递归进行中序遍历
     * @param root
     */
    public void inOrder2(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            System.out.print(root.val+" ");
            root=root.right;
        }

        /* 思路二（自己想）：比较复杂
        if(root==null){
            return;
        }
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.empty()){
            TreeNode tmp=stack1.pop();
            if(tmp.right!=null&&tmp.left!=null){
                stack1.push(tmp.right);
                stack1.push(tmp.left);
            }
            if(tmp.left==null||tmp.right==null){
                if(tmp.left!=null){
                    System.out.print(tmp.left.val+" ");
                    System.out.print(tmp.val+" ");
                    System.out.print(stack2.pop().val+" ");
                }else{
                    System.out.print(tmp.val+" ");
                    if(tmp.right!=null){
                        System.out.print(tmp.right.val+" ");
                    }
                    if(!stack2.empty()){
                        System.out.print(stack2.pop().val+" ");
                    }
                }
                continue;
            }
            stack2.push(tmp);
        }*/
    }

    /**
     * 后序遍历
     * @param root
     */
    public void postOrder(TreeNode root){
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
     * 非递归进行后序遍历
     * @param root
     */
    public void postOrder2(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode prev=null;
        while(root!=null||!stack.empty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(root.right==null||root.right==prev){
                System.out.print(root.val+" ");
                prev=root;
                root=null;
            }else{
                stack.push(root);
                root=root.right;
            }
        }
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

    /**
     * 判断二叉树是否是完全二叉树
     */
    public boolean isCompleteTree(TreeNode root){
        if(root==null){
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            if(cur!=null){
                queue.offer(cur.left);
                queue.offer(cur.right);
            }else{
                break;
            }
        }
        while(!queue.isEmpty()){
            TreeNode cur=queue.peek();
            if(cur==null){
                queue.poll();
            }else{
                return false;
            }
        }
        return true;
    }

    /**
     * 判断两二叉树是否是相同的 时间复杂度：O(min(m,n))
     */
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null&&q!=null){
            return false;
        }
        if(p!=null&&q==null){
            return false;
        }
        if(p==null&&q==null){
            return true;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    /**
     * 判断一个树是否是另一个树的子树 时间复杂度：O(t * s)
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(root==null){
            return false;
        }
        if(isSameTree(root,subRoot)){
            return true;
        }
        if(isSameTree(root.left,subRoot)){
            return true;
        }
        if(isSameTree(root.right,subRoot)){
            return true;
        }
        return false;
    }

    /**
     * 判断是否是平衡二叉树：每个节点都要判断是不是平衡的，每个节点都要求左右高度的差值<=1
     */
    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        return height(root)!=-1;
    }

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(leftHeight>=0 && rightHeight>=0 && Math.abs(leftHeight-rightHeight)<=1){
            return Math.max(leftHeight,rightHeight)+1;
        }else{
            return -1;
        }
    }

    /**
     * 判断一个二叉树是否是对称二叉树
     */
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }

    public static boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree){
        if(leftTree==null&&rightTree!=null){
            return false;
        }
        if(leftTree!=null&&rightTree==null){
            return false;
        }
        if(leftTree==null&&rightTree==null){
            return true;
        }
        if(leftTree.val!=rightTree.val){
            return false;
        }
        return isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(leftTree.right,rightTree.left);
    }
}

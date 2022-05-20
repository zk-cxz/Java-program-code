import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:二叉树的构建和定义
 * User: a
 * Date: 2022-05-21
 * Time: 0:32
 */
class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(char val){
        this.val=val;
    }
}

public class Main {
    public static int i=0;

    public static TreeNode createTree(String str){
        TreeNode root=null;
        if(str.charAt(i)!='#'){
            root=new TreeNode(str.charAt(i));
            i++;
            root.left=createTree(str);
            root.right=createTree(str);
        }else{
            i++;
        }
        return root;
    }

    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str=scanner.nextLine();
            TreeNode root=createTree(str);
            inOrder(root);
        }
    }
}

import java.util.Stack;

/**
 * Created by i-liuxiaofeng on 2017/9/11.
 */
public class erchashu {
    public static int max = 20;
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        TreeNode root = insertNodeFromArray(array, 0, array.length - 1);
        //qianxu(root);
       // zhongxu(root);
        //houxu(root);
        //feizhongxu(root);
        feixianxu(root);
    }
    public static TreeNode insertNodeFromArray(int[] array, int start, int end){
        if(end < start){
            return null;
        }

        int middle =  (start + end) / 2;

        TreeNode treeNode = new TreeNode(array[middle]);

        treeNode.left = insertNodeFromArray(array, start, middle - 1);
        treeNode.right = insertNodeFromArray(array, middle + 1, end);

        return treeNode;
    }
    //前序遍历 5 2 1 3 4 8 6 7  9 10
    public static void qianxu(TreeNode root){
        if(root!=null){
            visit(root.data);
            qianxu(root.left);
            qianxu(root.right);
        }
    }
    //先序非递归
    public static void feixianxu(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        if(root!=null){
            while (root!=null || !s.empty()){
                while(root!=null){
                    visit(root.data);
                    s.push(root);
                    root = root.left;
                }
                if(!s.empty()){
                    root = s.pop();
                    root = root.right;
                }
            }
        }
    }
    //中序遍  1 2 3 4 5 7 6 8 9 10
    public static void zhongxu(TreeNode root){
        if(root!=null){
            zhongxu(root.left);
            visit(root.data);
            zhongxu(root.right);
        }
    }
    //中序遍历非递归
    public static void feizhongxu(TreeNode root){
        Stack<TreeNode> s = new Stack();
        if(root!=null){
            while (root!=null||!s.empty()){
                while (root!=null){
                    s.push(root);
                    root = root.left;
                }
                if(!s.empty()){
                    root = s.pop();
                    visit(root.data);
                    root = root.right;
                }
            }
        }
    }
    //后序遍历 1 4 3 2 7 6 10 9 8 5
    public static void houxu(TreeNode root){
        if(root!=null){
            houxu(root.left);
            houxu(root.right);
            visit(root.data);
        }
    }
    public static void visit(int a){
        System.out.println(a);
    }
}

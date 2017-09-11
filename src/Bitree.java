import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by i-liuxiaofeng on 2017/9/4.
 */
public class Bitree{
    static int counter = 0;
    public static Node createBitree(Node root ,int[] a ,int i){
        if(i<a.length){
            if(a[i]==0){
                root = null;
            }else {
                Node lchild = new Node();
                Node rchild = new Node();
                root.data = a[i];
                root.left = createBitree(lchild,a,++counter);
                root.right = createBitree(rchild,a,++counter);
            }
        }
        return root;
    }
    public static void visitTNode(Node node) {
        System.out.print(node.data + " ");
    }
    //层次遍历
    public static void levelTraverse(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);// 从根节点入队列
        while (!queue.isEmpty()) {// 在队列为空前反复迭代
            Node bitNode = queue.poll();// 取出队列首节点
            visitTNode(bitNode);
            if (bitNode.left != null)
                queue.offer(bitNode.left);// 左孩子入列
            if (bitNode.right != null)
                queue.offer(bitNode.right);// 右孩子入列
        }
    }
    //先序遍历
    public static void preTraverse(Node root){
        if(root!=null){
            visitTNode(root);
            preTraverse(root.left);
            preTraverse(root.right);
        }
    }
    //先序遍历  非递归
    public static void preStack(Node root){
        Stack<Node> s = new Stack<>();
        Node node = root;
        while(node!=null|s.size()>0){
            if(node!=null){
                visitTNode(node);
                s.push(node);
                node = node.left;
            }else{
                node = s.pop();
                node = node.right;
            }
        }

    }    //中序遍历  递归
    public static void inTraverse(Node root){
        if(root!=null){
            inTraverse(root.left);
            visitTNode(root);
            inTraverse(root.right);
        }
    }
    //中序遍历  非递归
    public  static void inStack(Node root){
            Stack<Node> s = new Stack<Node>();
            Node node = root;
            while(node!=null|s.size()>0){
                if(node!=null){
                    s.push(node);
                    node = node.left;
                }else {
                    node = s.pop();
                    visitTNode(node);
                    node = node.right;
                }
            }
        }

       //后序遍历
    public static void postTraverse(Node root){
        if(root!=null){
            postTraverse(root.left);
            postTraverse(root.right);
            visitTNode(root);
        }
    }
    //后序遍历非递归
    public static void postStack(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        Node node = root;
        while(node!=null|| s1.size()>0){
            if(node!=null){
                s1.push(node);
                s2.push(node);
                node = node.right;
            }else{
                node = s1.pop();
                node = node.left;
            }
        }
        while (s2.size()>0){
            visitTNode(s2.pop());
        }
    }
    //递归求数的深度
    public static int FindTreeDeep(Node root){
        int deep = 0;
        if(root!=null){
            int lchilddeep = FindTreeDeep(root.left);
            int rchilddeep = FindTreeDeep(root.right);
            deep = lchilddeep>= rchilddeep? lchilddeep+1:rchilddeep+1;
        }
        return deep;
    }
    //非递归求数的深度
    public static int TreeDeepStack(Node root){
        int deep = 0;
        Stack<Node> s = new Stack<>();
        Stack<Integer> tag = new Stack<>();
        Node p = root; //将p指针指向根节点，P为当前节点指针
        while(p!=null||s.size()>0){  //将P压入栈s中，0压人栈tag中，并令p指向其左孩子
            while (p!=null){
                s.push(p);
                tag.push(0);
                p = p.left;
            }
            if(tag.peek()==1){  //如果tag栈的栈顶元素为1，同栈的深度比较，对栈s和栈tag出栈操作，P指向null
                deep = deep > s.size()? deep : s.size();
                s.pop();
                tag.pop();
                p = null;
            }else{      //如果栈顶元素为0，将p指向s栈顶的右孩子，弹出栈tag，并把1压入tag
                p = s.peek();
                p = p.right;
                tag.pop();
                tag.push(1);

            }
        }

        return deep;

    }
    //利用层次遍历的算法求二叉树的深度
    public static int treeDeep(Node root){
        if(root == null)
            return 0 ;
        Node current = null;
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        int cur , last;
        int level = 0;
        while (!queue.isEmpty()){
            cur = 0;
            last = queue.size();
            while (cur < last){
                current = queue.poll();
                cur++;
                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);

                }
            }
            level++;
        }
        return level;

    }
    public static void main(String[] args) {
        Node root = new Node();
        int a[] = { 1, 2, 3, 0, 0, 4, 0, 0, 5, 0, 0};
        root = createBitree(root,a,counter);
        //levelTraverse(root);//层次遍历
        //System.out.println();
        preTraverse(root);//先序遍历
        System.out.println();
        preStack(root);  //先序遍历非递归
        System.out.println();
        inTraverse(root);//中序遍历
        System.out.println();
        inStack(root); //中序遍历非递归
        System.out.println();
        postTraverse(root);//后序遍历
        System.out.println();
        postStack(root); //后序遍历非递归
        System.out.println();
        System.out.println(FindTreeDeep(root)); //递归求数的深度
       System.out.println(TreeDeepStack(root));  //非递归求树的深度
        System.out.println(treeDeep(root));

    }
}
class Node {
   public int data;
    public Node left;
    public Node right;

  /* public Node(int newData){
       left = null;
       right = null;
       data = newData;
   }*/
}
/*public static void create(Bitree b){
    int  i;
    Scanner sc = new Scanner(System.in);
    i = sc.nextInt();
    if()

}*/

import java.util.Scanner;

/**
 * Created by i-liuxiaofeng on 2017/9/18.
 */
public class ceshi {
    public static String[] getAllGroup(int n){
        int len = (int) Math.pow(2, n);
        String[] result = new String[len];
        if(n == 1){
            result[0] = "0";
            result[1] = "1";
            return result;
        }
        String[] temp = getAllGroup(n-1);
        for(int i = 0;i < temp.length;i++){
            result[i] = "0" + temp[i];
            result[len-1-i] = "1" + temp[i];
        }
        return result;
    }
    /*
     * 参数n:代表有1~n的n个不同整数
     * 函数功能：打印出1~n中所有随机组合的几个数，其相加的和等于sum
     */
    public static int printManySumN(int n,int sum){
        String[] allGroup = getAllGroup(n);
        int a = 0;
        int s = 0;
        for(int i = 0;i < allGroup.length;i++){
            char[] temp = allGroup[i].toCharArray();
            int tempSum = 0;
            for(int j = 0;j < temp.length;j++){
                if(temp[j] == '1')
                    tempSum += (j+1);
            }
            if(tempSum == sum){
                for(int j = 0;j < temp.length;j++){
                    if(temp[j] == '1')
                        //System.out.print((j+1)+" ");
                        //continue;
                        a++;
                }
                s++;
            }
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a  = printManySumN(n,m);
        System.out.println(a);
    }
}

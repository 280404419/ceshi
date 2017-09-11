/**
 * Created by i-liuxiaofeng on 2017/9/11.
 */
public class didui
{
    public static void main(String[] args) {
        int a = fun1(6);
        System.out.println(a);
    }
    public static int fun(int n){
       /* if(n == 0){
            return 1;
        }else {
            return n * fun(n-1);
        }*/
       int f;
       if(n==0)
           f = 1;
       else {
           f = n*fun(n-1);
       }
        return f;
    }
    public static int fun1(int n){
        int i,s1,s2,s = 0;
        s1 = 1;
        s2 = 1;
        for (i = 3 ;i<n;i++){
            s = s1+s2;
            s2 = s1;
            s1 = s;
        }
        return s;
    }

}

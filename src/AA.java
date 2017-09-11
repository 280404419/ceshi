/**
 * Created by i-liuxiaofeng on 2017/9/4.
 */
public class AA {
    public static void main(String[] args) throws InterruptedException {
        AA a= new AA();
        a=null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("b");

    }
    protected  void finalize(){
        System.out.println("a");
        System.out.println(10/0);
    }
}

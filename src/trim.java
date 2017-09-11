/**
 * Created by i-liuxiaofeng on 2017/7/27.
 */
public class trim {
    public static void main(String[] args) {
        String a = " hello world ";
        String b = "hello,world,zuguo";
        System.out.println(a.equals(b));
        a = a.trim();
        System.out.println(a.equals(b));
        String[] split = b.split(",");
        for (int i = 0; i <split.length ; i++) {
            System.out.println(split[i]);
        }
    }
}

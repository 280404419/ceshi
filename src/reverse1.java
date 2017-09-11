/**
 * Created by i-liuxiaofeng on 2017/8/31.
 */
public class reverse1 {
    public static int reverse(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)   //当翻转的数溢出的时候，返回0
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int a = reverse(-2147483648);
        System.out.println(a);
    }
}

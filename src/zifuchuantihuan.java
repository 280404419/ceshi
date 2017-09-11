/**
 * Created by i-liuxiaofeng on 2017/8/24.
 */
public class zifuchuantihuan {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("we are happy");
        System.out.println(replaceSpace(str));
        System.out.println(Integer.MIN_VALUE);
    }

    public static String replaceSpace(StringBuffer str) {
        String sti = str.toString();
        char[] strChar = sti.toCharArray();
        StringBuffer stb = new StringBuffer();
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == ' ') {
                stb.append("%20");
            } else {
                stb.append(strChar[i]);
            }
        }
        return stb.toString();
    }
}
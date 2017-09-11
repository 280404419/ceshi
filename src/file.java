import java.io.File;

/**
 * Created by i-liuxiaofeng on 2017/8/2.
 */
public class file
{
    public static void main(String[] args) {
        String s  = makePath("hello", "world", "13sd", "china", "cum", "ict");
        System.out.println(s);
    }
    public static String makePath(String... partPaths) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String part : partPaths) {
            if (part.endsWith(File.separator)) { //endsWith(part1)方法的作用是判断参数是否以特定的字符串part1结尾
                part = removeEnd(part, File.separator);  //File.separator="\"
            }
            if ((i > 0) && (!part.startsWith(File.separator))) {
                part = File.separator + part;
            }
            sb.append(part);
            i++;
        }
        return sb.toString();
    }
    public static String removeEnd(String str, String remove) {
        return !isEmpty(str) && !isEmpty(remove)?(str.endsWith(remove)?str.substring(0, str.length() - remove.length()):str):str;
    }
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}

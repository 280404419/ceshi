/**
 * Created by i-liuxiaofeng on 2017/8/15.
 */
public class PBDemo {
    public static void main(String args[]) {
        try {
            ProcessBuilder proc = new ProcessBuilder("mspaint.exe"/*, "testfile"*/);
            proc.start();
        } catch (Exception e) {
            System.out.println("Error executing notepad.");
        }
    }
}

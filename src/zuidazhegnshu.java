import java.util.Scanner;

/**
 * Created by i-liuxiaofeng on 2017/9/4.
 */
public class zuidazhegnshu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n];
            for(int i = 0;i<n;i++){
                str[i]  = sc.nextLine();
            }
            System.out.println(str);
        }
    }
}

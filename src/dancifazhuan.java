import java.util.Scanner;

/**
 * Created by i-liuxiaofeng on 2017/9/4.
 */
public class dancifazhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String[] s1 = sc.nextLine().trim().split(" ");
            String s = "" ;
            for(int i = s1.length - 1;i >=0;i--){
                if(i!=0){
                    s += s1[i] + " ";
                }else {
                    s+= s1[i];
                }

            }
            System.out.println(s);
        }

    }
}

import org.junit.Test;

/**
 * Created by i-liuxiaofeng on 2017/9/7.
 */
public class zuidachagndu {
    @Test
    public void test(){
        int[] num = {1,2,3,2,2,2,5,4,2};
        System.out.println(moreThanHaft(num));
    }

    public int moreThanHaft(int[] num){
        int result = -1;
        int times = 0;
        for(int i=0;i<num.length;i++){
            if(times==0){
                result = num[i];
                times++;
            }
            else{
                if(num[i]==result){
                    times++;
                }
                else{
                    times--;
                }
            }
        }

        return result;
    }
}

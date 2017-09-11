import java.util.HashMap;
import java.util.Map;

/**
 * Created by i-liuxiaofeng on 2017/8/28.
 */
public class target {
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 13;
        int[] a = twosum1(num,target);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static int[] twosum(int[] nums,int target){
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }
    public static int[] twosum1(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            int com = target - nums[i];
            if(map.containsKey(com)){
                return new int[] {map.get(com),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }

}

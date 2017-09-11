/**
 * Created by i-liuxiaofeng on 2017/8/24.
 */
//数组查找
public class Solution {
    public static void main(String[] args) {
        int[][] array = {{1 ,2 ,3},{2,3,4},{3,4,5}};
        boolean b = find(array,10);
        System.out.println(b);
    }
    public static boolean find(int[][] array,int target){
        int len = array.length-1;
        int i = 0;
        while((len>=0)&&(i<array[0].length)){
            if(array[len][i]>target){
                len--;
            }else if(array[len][i]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }
}

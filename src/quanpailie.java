/**
 * Created by i-liuxiaofeng on 2017/9/18.
 */
public class quanpailie {
    public void recursionArrange(char[] arrayA,int start,int end){
        if(end <= 1)
            return;
        if(start == end){
            for(int i = 0;i < arrayA.length;i++)
                System.out.print(arrayA[i]);
            System.out.println();
        }
        else{
            for(int i = start;i <= end;i++){
                swap(arrayA,i,start);
                recursionArrange(arrayA,start+1,end);
                swap(arrayA,i,start);
            }
        }

    }
    //交换数组m位置和n位置上的值
    public void swap(char[] arrayA,int m,int n){
        char temp = arrayA[m];
        arrayA[m] = arrayA[n];
        arrayA[n] = temp;
    }

    public static void main(String[] args){
        quanpailie test = new quanpailie();
        String A = "abc";
        char[] arrayA = A.toCharArray();
        test.recursionArrange(arrayA,0,arrayA.length-1);
    }
}

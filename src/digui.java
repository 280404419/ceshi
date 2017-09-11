import org.junit.Test;

/**
 * Created by i-liuxiaofeng on 2017/9/7.
 */
public class digui {
    @Test
    public void test(){
        //char[] cs = {'a','b','c','d','e'};
       /* char[] cs = {'a','b','c'};
        int length = cs.length;
        recursionSwap(cs,0,length);*/
        int a[] = {-2, 10,12, -26, 33};
        int max = MaxSum(a,5);
        System.out.println(max);
    }

    public void swap(char[] cs,int index1,int index2){
        char temp = cs[index1];
        cs[index1]=cs[index2];
        cs[index2]=temp;
    }

    public void recursionSwap(char[] cs,int start,int length){
        if(start>=length-1){
            print(cs);
            return;
        }
        for(int i=start;i<length;i++){
            swap(cs,start,i);
            recursionSwap(cs,start+1,length);
            swap(cs,start,i);
        }
    }

    public void print(char[] cs){
        for(int i=0;i<cs.length;i++){
            System.out.print(cs[i]);
        }
        System.out.println();
    }
    public int MaxSum(int[] a, int n)
    {
        int nSum = 0;
        int nValue=0;

        for(int i = 0; i < n; i++)
        {
            if (nValue <= 0)
                nValue = a[i];
            else
                nValue += a[i];

            if(nSum < nValue)
                nSum = nValue;
        }

        return nSum;
    }

}

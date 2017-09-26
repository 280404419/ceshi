/**
 * Created by i-liuxiaofeng on 2017/9/25.
 */
public class hebingshuzu {
    public static void main(String[] args) {
        int s[]  = new int[11];
        int[] a = {1,5,6,7,9};
        int[] b = {2,4,8,10,13,14};
        int len1 = a.length;
        int len2 = b.length;
       int[] l = combine(a,b,len1,len2);
        for (int i=0;i<11;i++){
            System.out.println(l[i]);
        }
    }
    public static int[] combine(int[] a,int[] b,int len1,int len2){
        if(a==null||b==null||(len1+len2)>Integer.MAX_VALUE)
            return null ;
        int a1 = 0;
        int b1 = 0;

        int zong = len1+len2;
        int[] l = new int[zong];
        int j=0;
        while (a1<=len1-1&&b1<=len2-1){
            if(a[a1]<b[b1]){
                l[j++]=a[a1++];
            }else{
                l[j++]=b[b1++];
            }
        }
        while(a1<=len1-1)
            l[j++]=a[a1++];
        while (b1<=len2-1)
            l[j++]=b[b1++];
        return l;
    }



}

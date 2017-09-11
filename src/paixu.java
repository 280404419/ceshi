import sun.awt.Win32ColorModel24;
import sun.awt.image.ShortInterleavedRaster;

import java.awt.event.WindowListener;

/**
 * Created by i-liuxiaofeng on 2017/9/6.
 */
public class paixu {
    public static void main(String[] args) {
        int a[] = {60,71,49,11,82,24,3,66};
        //insert(a,9);
       // long start = System.currentTimeMillis();
       // xier(a,8);
        //maopao(a,8);
        //kuaipai(a,0,7);
        //long end = System.currentTimeMillis();
        //xuanze(a,8);
        guibing(a,8);
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }
      ///  System.out.println((end-start));
    }
    //插入排序
    public static void insert(int[] a ,int n){
        int i,j;
        int temp;
        for ( i=0;i<n;i++){
            temp = a[i];
            j = i-1;
            while (j>-1&&temp<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
    }
    //希尔排序
    public static void xier(int[] a ,int n){
        int x ;
        int i,j,d;
        d = n/2;
        while (d>=1){
            for (i=d;i<n;i++){
                x = a[i];
                j= i-d;
                while ((j>=0)&&(x<a[j])){
                    a[j+d] = a[j];
                    j = j - d;
                }
                a[j+d] = x;
            }
            d = d/2;
        }
    }
    //冒泡
    public static void maopao(int[] a ,int n){
        for (int i = 0;i<n-1;i++){
            for (int j = 0;j < n-i-1;j++ ){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    //快排
    public static void kuaipai(int[] a, int t,int w){
        int i ,j;
        int x ;
        if(t<w){
            i=t; j=w; x=a[i];  //选取一个基准
            while (i<j){  //进行一趟排序
                while ((a[j] >= x)&&(j>i))
                    j--;
                if(i<j){
                    a[i] = a[j];
                    i++;
                }
                while ((a[i] <= x)&&(j>i))
                    i++;
                if(i<j){
                    a[j] = a[i];
                    j--;
                }
            }
            a[i] = x;
            kuaipai(a,t,j-1);
            kuaipai(a,j+1,w);
        }
    }
    //选择排序
    public static void xuanze(int[] a ,int n){
        int k;
        int x;
        for (int i=0;i<n-1;i++){  //进行n-1轮循环
            k = i;
            for (int j = i+1;j<n;j++)
                if(a[j]<a[k])
                    k=j;
            if(i!=k)
            {
                x = a[i];
                a[i] = a[k];
                a[k] = x;        //找出最小值放在第一位
            }
        }
    }
    //归并算法
    public static void guibing(int[] r,int n){
        int t[] = new int[n];
        int i;
        for (i=0;i<n;i++){
            t[i] = 0;
        }
        int s=1;
        while (s<n){
            ytgb(s,n,t,r);
            for (i=0;i<n;i++){
                t[i] = r[i];
            }
            s = s*2;
        }
    }
    public static void ytgb(int s,int n,int[] t ,int[] r ){
        int i=0;
        while (i<(n-2*s+1)){
            hb(r,i,i+s-1,i+2*s-1,t);
            i = i + 2*s;
        }
        if(i<(n-s))
            hb(r,i,i+s-1,n-1,t);
        else {
            while (i<n){
                t[i] = r[i++];
            }
        }
    }
    public static void hb(int r[],int h,int m,int w,int t[]){
        int i, j , k;
        i = h;
        j = m+1;
        k = h -1 ;
        while ((i<=m)&&(j<=w)){
            k++;
            if(r[i]<=r[j]){
                t[k] = r[i++];
            }else {
                t[k] = r[j++];
            }
        }
        if(i>m){
            while (j<=w)
                t[++k] = r[j++];
        }else {
            while (i<=m)
                t[++k] = r[i++];
        }
    }
}

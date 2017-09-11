import sun.org.mozilla.javascript.internal.ast.ScriptNode;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by i-liuxiaofeng on 2017/9/4.
 */
public class Input {
    /**
     * 回车换行输入n个变量
     * 输入：
     * 		1
     * 		2
     * 		3
     * 返回：
     * 		int[] arr = {1,2,3}
     * @return 返回长度为n的int数组
     */
    public static int[] input1(){
        Scanner sc = new Scanner(System.in);
        int n = 3;                          //个数固定的情况
        int[] arr = new int[n];										//n个整数
        //String[] arr = new String[n];								//n个字符串
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(sc.nextLine().trim());		//n个整数
            //arr[i] = Integer.parseInt(sc.nextLine().trim());
            //arr[i] = sc.nextLine();								//n个字符串
        }
        sc.close();
        return arr;
    }



    /**
     * 首先输入一个整数n，然后再回车换行输入n个变量
     * 输入：
     * 		3
     * 		1
     * 		2
     * 		3
     * 返回：
     * 		int[] arr = {1,2,3}
     * @return 返回长度为n的int数组
     */
    public static int[] input2(){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());   //先输入个数
        int[] arr = new int[n];										//n个整数
        //String[] arr = new String[n];								//n个字符串
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(sc.nextLine().trim());		//n个整数
            //arr[i] = sc.nextLine();								//n个字符串
        }
        sc.close();
        return arr;
    }


    /**
     * 以空格或者\t分隔输入n个整数
     * 输入：
     * 		1 2 3
     * 返回：
     * 		int[] arr = {1,2,3}
     * @return 返回长度为n的int数组
     */

    public static int[] input3(){
        /*Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");
        int[] arr2 = new int [arr1.length];
        //String[] arr = sc.nextLine().split("\t");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        sc.close();
        return arr2;*/
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.nextLine().split(" ");  //都把他输入成字符串了
        int[] arr2 = new int[arr1.length];
        for (int i = 0;i<arr1.length;i++){
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        sc.close();
        return arr2;
    }


    /**
     * 首先输入一个整数n，然后回车换行输入n组整数，每组数用空格或者\t分隔
     * 输入：
     * 		3
     * 		1 2
     * 		3 4
     * 		5 6
     * 返回：
     * 		集合{{1,2},{3,4},{5,6}}
     * @return 返回长度为n的List
     */
    public static List<List<Integer>> input4(){
       /* Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list2 = new ArrayList<>();
            String[] arr = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                list2.add(Integer.parseInt(arr[j]));
            }
            list1.add(list2);
        }
        sc.close();
        return list1;*/
       Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.nextLine().trim());
       List<List<Integer>> list1 = new ArrayList<>();
       for(int i=0;i<n;i++){
           List<Integer> list2 = new ArrayList<>();
           String[] arr = sc.nextLine().split(" ");
           for(int j = 0;j<arr.length;j++){
               list2.add(Integer.parseInt(arr[j]));
           }
           list1.add(list2);

       }
       sc.close();
       return list1;
    }


    /**
     * 输入指定范围内的整数，带输入提示和检测
     * @return 返回整数n
     */
    public static int input5() {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数n,范围为1-10：");
        while(true){
            String line = sc.nextLine();
            int n = 0;
            try {
                n = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("输入错误！请重新输入：");
                continue;
            }
            if(n >= 1 && n <= 10){
                sc.close();
                return n;
            } else {
                System.out.println("输入错误！请重新输入：");
            }
        }*/
       Scanner sc = new Scanner(System.in);
        System.out.println("请输入指定范围内的整数1-10：");
        while(true){
            String line  = sc.nextLine();
            int n = 0;
            try {
               n = Integer.parseInt(line);
            }catch (NumberFormatException e){
                System.out.println("输入错误，请重新输入：");
                continue;
            }
            if(n>=1&&n<=10){
                sc.close();
                return n;
            }else {
                System.out.println("输入错误，请重新输入：");
            }

        }
    }
    //一直输入
    public static void input6(){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        /*int a = input5();
        System.out.println(a);*/
        input6();
    }
}

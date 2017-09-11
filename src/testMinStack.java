import org.junit.Test;

import java.util.Stack;

/**
 * Created by i-liuxiaofeng on 2017/9/7.
 */

public class testMinStack {
    //自定义栈，min函数得到当前最小值

    @Test
    public void test(){
        MinStack ms = new MinStack();
        ms.push(5);
        System.out.println(ms.min());
        ms.push(6);
        ms.push(2);
        ms.push(1);
        System.out.println(ms.min());
        ms.pop();
        System.out.println(ms.min());
        ms.pop();
        System.out.println(ms.min());

    }
}

class MinStack{
    private Stack<Integer> minStack = new Stack<Integer>();
    private Stack<Integer> stack = new Stack<Integer>();

    public int pop(){
        minStack.pop();
        return stack.pop();
    }

    public void push(int num){
        if(minStack.size()<=0){
            minStack.push(num);
            return;
        }
        Integer min = minStack.lastElement();
        if(num<min){
            minStack.push(num);
        }
        else{
            minStack.push(min);
        }
        stack.push(num);
    }

    public int min(){
        if(minStack.size()<=0){
            return -1;
        }
        return minStack.lastElement();
    }
}
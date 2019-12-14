package com.sinerry.flow;


import org.testng.annotations.Test;

@Test
public class LoopTest {
    public int getMaxNumRem7(int x,int y) {
        /*
        * 编写一个方法`int getMaxNumRem7(int x,int y)`
        * 找出`0 - y`范围内除以x 余 7最大的数，
        * 找到返回该数，否则返回-1
        * */
        for(int i = y; i >= 0; i--) {
            if(i % x == 7) {
                return i;
            }
        }
        return -1;
    }
    public void test() {
        int ret = getMaxNumRem7(40,400);
        System.out.println(ret);
    }
}

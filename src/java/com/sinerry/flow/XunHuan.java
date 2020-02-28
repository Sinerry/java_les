package com.sinerry.flow;



public class XunHuan {
    /*
     * while
     * do-while
     * for
     *
     * break
     *
     * continue
     * */
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 20) {
            sum += i;
            i++;
        }
        System.out.println(String.format("sum = %s",sum));
    }
}

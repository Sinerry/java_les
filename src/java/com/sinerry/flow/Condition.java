package com.sinerry.flow;

import java.util.Scanner;

public class Condition {
    /*
    * 条件结构：
    *   if
    *   if-else
    *   if-elseif-else
    *
    * */
    public static void main(String[] args) {
        System.out.println("请输入你的年龄：");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age >= 18) {
            System.out.println("成年人，做事对自己负责!");
        }else {
            System.out.println("再等等吧!");
        }
    }
}

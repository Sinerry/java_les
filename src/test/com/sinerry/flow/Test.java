package com.sinerry.flow;

@org.testng.annotations.Test

public class Test {
    public void test1() {
        int n1 = 1;
        n1 = ++n1;
        System.out.println(n1);// 2

        int n2 = 1;
        n2 = n2++;
        System.out.println(n2);// 1

        int n3 = 1;
        n3 = --n3;
        System.out.println(n3);// 0

        int n4 = 1;
        n4 = n4--;
        System.out.println(n4);// 1

        int n = 3;
        switch (n) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            default:
                System.out.println(0);
        }

        int a = 0;
        for(int i = 0; i < 100; i++) {
            a = a++;
        }
        System.out.println(a);
    }
}

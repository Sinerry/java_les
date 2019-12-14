package com.sinerry.flow;

public class AgeCheck {
    public static String doCheck(int age) {
        if(age < 0 || age > 200) {
            return "error";
        }
        if(age < 7) {
            return "儿童";
        }else if(age < 18) {
            return "少年";
        }else if(age < 41) {
            return "青年";
        }else if(age < 60) {
            return "中年";
        }else{
            return "老年";
        }
    }
}

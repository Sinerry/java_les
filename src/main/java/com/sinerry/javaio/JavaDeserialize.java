package com.sinerry.javaio;

import java.io.*;

// 序列化 和 反序列化
public class JavaDeserialize {
    public static void main(String[] args) {
        final String destPath = "./src/main/java/com/sinerry/javaio/3.txt";
        ObjectInputStream in = null;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(destPath);
            in = new ObjectInputStream(inputStream);
            Object o = in.readObject();
            if(o instanceof Car) {
                Car car = (Car)o;
                System.out.println(car);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(in != null) {
                    in.close();
                }
                if(inputStream != null) {
                    inputStream.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.sinerry.io;

import com.sinerry.io.entity.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// 序列化 和 反序列化
public class JavaSerialize {
    public static void main(String[] args) {
        final String srcPath = "./src/main/java/com/sinerry/io/3.txt";
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(srcPath));
            out.writeObject(new Car(1,"皇冠","丰田"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(out != null) {
                    out.flush();
                    out.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

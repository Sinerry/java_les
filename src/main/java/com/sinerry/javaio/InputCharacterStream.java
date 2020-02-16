package com.sinerry.javaio;


import java.io.*;

// 字符流
public class InputCharacterStream {
    public static void main(String[] args) {
        final String path = "./src/main/java/com/sinerry/javaio/1.txt";
        InputStream inputStream = null;
        Reader reader = null;
        try {
            // 输入字节流
            inputStream = new FileInputStream(path);
            // 输入字符流
            reader = new InputStreamReader(inputStream);
            int temp;
            StringBuilder s = new StringBuilder();
            while ((temp = reader.read()) != -1) {
                s.append((char)temp);
            }
            System.out.println(s.toString());

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null) {
                    inputStream.close();
                }
                if(reader != null) {
                    reader.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

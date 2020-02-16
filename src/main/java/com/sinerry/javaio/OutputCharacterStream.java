package com.sinerry.javaio;


import java.io.*;

// 字符流
public class OutputCharacterStream {
    public static void main(String[] args) {
        final String srcPath = "./src/main/java/com/sinerry/javaio/1.txt";
        final String destPath = "./src/main/java/com/sinerry/javaio/2.txt";
        InputStream inputStream = null;
        Reader reader = null;
        Writer writer = null;
        try {
            inputStream = new FileInputStream(srcPath);
            reader = new InputStreamReader(inputStream);
            writer = new FileWriter(destPath);
            int temp;
            StringBuilder s = new StringBuilder();
            while ((temp = reader.read()) != -1) {
                s.append((char)temp);
            }
            System.out.println(s);
            writer.write(s.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) {
                    inputStream.close();
                }
                if(writer != null) {
                    writer.close();
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

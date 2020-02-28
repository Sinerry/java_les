package com.sinerry.io;


import java.io.*;

// 缓冲字符输入流：默认缓冲8K
public class BufferedCharacterStreamReader {
    public static void main(String[] args){
        final String srcPath = "./src/main/java/com/sinerry/io/1.txt";
        InputStream inputStream = null;
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            inputStream = new FileInputStream(srcPath);
            reader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(reader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(inputStream != null) {
                    inputStream.close();
                    reader.close();
                    bufferedReader.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

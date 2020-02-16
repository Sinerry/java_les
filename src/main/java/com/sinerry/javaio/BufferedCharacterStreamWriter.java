package com.sinerry.javaio;


import java.io.*;

// 缓冲字符输入流
public class BufferedCharacterStreamWriter {
    public static void main(String[] args){
        final String srcPath = "./src/main/java/com/sinerry/javaio/1.txt";
        final String destPath = "./src/main/java/com/sinerry/javaio/2.txt";
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        Writer writer = null;
        Reader reader = null;
        try {
            writer = new FileWriter(destPath);
            reader = new FileReader(srcPath);
            bufferedWriter = new BufferedWriter(writer);
            bufferedReader = new BufferedReader(reader);
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                bufferedWriter.write(temp);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(writer != null) {
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    writer.close();
                }
                if(reader != null) {
                    bufferedReader.close();
                    reader.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

package com.sinerry.io.respository;



import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;


// 文件操作类
public class FileRepository {
    private static File f;
    private String path;
    public FileRepository(String path) {
        f = new File(path);
        this.path = path;
    }

    /*
     * 获取目录下的所有
     * */
   public String findAll() {
      String[] names = f.list();
      return Arrays.toString(names);
   }

   /*
   * 查看所有目录
   * */
   public String findAllDirectory() {
       LinkedList<String> linkedList = new LinkedList<>();
       String[] names = f.list();
       File temp;
       for (String name:names) {
           temp = new File(path +'/'+ name);
           if(temp.isDirectory()) {
                linkedList.add(name);
           }
       }
       return linkedList.toString();
   }

   /*
   * 查看所有文件
   * */

   public String findAllFile() {
       LinkedList<String> linkedList = new LinkedList<>();
       String[] names = f.list();
       File temp = null;
       for (String name:names) {
           temp = new File(path + '/' + name);
           if(temp.isFile()) {
               linkedList.add(name);
           }
       }
       return linkedList.toString();
   }



   /*
   * 删除目录
   * */
   public Boolean deleteDirectory(String dirname) {
       File temp = new File(path + '/' + dirname);
       if(temp.exists() && temp.isDirectory()) {
           return temp.delete();
       }
       return false;
   }
    /*
     * 删除文件
     * */
    public Boolean deleteFile(String filename) {
        File temp = new File(path + '/' + filename);
        if(temp.exists() && temp.isFile()) {
            return temp.delete();
        }
        return false;
    }
}

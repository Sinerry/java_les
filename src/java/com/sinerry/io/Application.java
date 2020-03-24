package com.sinerry.io;


import com.sinerry.io.respository.FileRepository;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("欢迎来到文件管理系统!!!");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        // 指定要读的路径
        String path = "/Users/app/Desktop/node";
        FileRepository repository = new FileRepository(path);
        int option;
        do {
            System.out.println("1.查看所有");
            System.out.println("2.查看所有目录");
            System.out.println("3.查看所有文件");
            System.out.println("4.删除目录");
            System.out.println("5.删除文件");
            System.out.println("0.退出系统");
            System.out.print("请选择>> ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    // 查看所有
                    String all = repository.findAll();
                    System.out.println(all);
                    break;
                case 2:
                    // 查看所有目录
                    String allDirs = repository.findAllDirectory();
                    System.out.println(allDirs);
                    break;
                case 3:
                    // 查看所有文件
                    String allFiles = repository.findAllFile();
                    System.out.println(allFiles);
                    break;
                case 4:
                    // 删除目录
                    System.out.print("请输入要删除的目录名>> ");
                    String name = scanner2.next();
                    Boolean flag = repository.deleteDirectory(name);
                    if(flag) {
                        System.out.println("目录删除成功");
                    }else {
                        System.out.println("该目录不存在，删除失败");
                    }
                    break;
                case 5:
                    // 删除文件
                    System.out.print("请输入要删除的目录名>> ");
                    name = scanner2.next();
                    flag = repository.deleteFile(name);
                    if(flag) {
                        System.out.println("文件删除成功");
                    }else {
                        System.out.println("该文件不存在，删除失败");
                    }
                    break;
                case 0:
                    System.out.println("已退出，欢迎下次光临!!!");
                    return;
            }

        }while (option != -1);

    }
}

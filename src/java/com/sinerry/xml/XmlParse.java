package com.sinerry.xml;

import com.sinerry.xml.entity.Book;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XmlParse{
    public static void main(String[] args) {
        read();

        write();
        /*
        update();

        delete();*/
    }

    /*
    * 读
    * */
    private static void read(){
        String path = XmlParse.class.getResource("").getPath();
        SAXReader saxReader = new SAXReader();
        try{
            Document document = saxReader.read(path + "/type.xml");
            Element root = document.getRootElement();
            Iterator<Element> iterator = root.elementIterator();
            Element element;
            while (iterator.hasNext()){
                element = iterator.next();
                Iterator<Attribute> iter = element.attributeIterator();
                while (iter.hasNext()){
                    Attribute attr = iter.next();
                    System.out.println(String.format("%s = %s",attr.getName(),attr.getValue()));
                }
                System.out.println("------------");
            }
        }catch (DocumentException e){
            e.printStackTrace();
        }

    }

    /*
    * 写
    * */
    private static void write(){
        // 1. 创建虚拟Document
        Document document = DocumentHelper.createDocument();
        // 2. 添加节点 （根节点，子节点，属性节点，文本节点）
        Element root = document.addElement("books");
        List<Book> books = init();
        Element element;

        for (Book book:books){
            element = root.addElement("book");
            element.addAttribute("id",String.format("%s",book.getId()));
            Element name = element.addElement("name");
            name.addText(book.getName());
            Element author = element.addElement("author");
            author.addText(book.getAuthor());
            Element price = element.addElement("price");
            price.addText(String.format("%s",book.getPrice()));
        }
        String path = XmlParse.class.getResource("").getPath();
        Writer writer = null;
        XMLWriter xmlWriter = null;

        // 3.写入
        try{
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setEncoding("UTF-8");
            writer = new FileWriter(path + "/books.xml");
            xmlWriter = new XMLWriter(writer,format);
            xmlWriter.write(document);
            System.out.println("写入成功");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(writer != null) {
                    writer.close();
                }
                if(xmlWriter != null){
                    xmlWriter.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /*
    * 改
    * */

    private static void update(){

    }

    /*
    * 删
    * */
    private static void delete(){

    }

    private static List<Book> init(){
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"Spring Boot实战","sinerry",37.5F));
        books.add(new Book(2,"JVM原理","sinerry",49F));
        books.add(new Book(3,"分布式与微服务","sinerry",45F));
        return books;
    }
}
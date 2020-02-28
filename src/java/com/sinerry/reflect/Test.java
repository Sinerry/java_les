package com.sinerry.reflect;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 读取XML，根据反射创建对象，并赋值
        SAXReader saxReader = new SAXReader();
        String path = Test.class.getResource("").getPath();
        List list = new ArrayList();
        try {
            Document document = saxReader.read(path + "/books.xml");
            Element root = document.getRootElement();
            String className = root.attributeValue("class");
            Class clazz = Class.forName(className);
            Constructor constructor = clazz.getDeclaredConstructor();
            Element element;
            Attribute attribute;
            Object obj;
            Iterator<Element> elementIterator = root.elementIterator();
            while (elementIterator.hasNext()){
                obj = constructor.newInstance();
                element = elementIterator.next();
                Iterator<Attribute> attributeIterator = element.attributeIterator();
                while (attributeIterator.hasNext()){
                    attribute = attributeIterator.next();
                    String key = attribute.getName();
                    String methodName = key.substring(0,1).toUpperCase() + key.substring(1);
                    String value = attribute.getValue();
                    Field field = clazz.getDeclaredField(key);
                    Class c = field.getType();
                    String type = c.getSimpleName();

                    Method method = clazz.getDeclaredMethod("set" + methodName,c);
                    switch (type){
                        case "Integer":
                            method.invoke(obj,Integer.parseInt(value));
                            break;
                        case "Float":
                            method.invoke(obj,Float.parseFloat(value));
                            break;
                        case "Double":
                            method.invoke(obj,Double.parseDouble(value));
                            break;
                        case "String":
                            method.invoke(obj,value);
                            break;
                    }
                }
                list.add(obj);
            }
            System.out.println(list);
        }catch (DocumentException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }
}

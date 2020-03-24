package com.sinerry.jr;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reflect {
    /*
    * 基本类型的反射
    *   Class[] clazz = new Class[]{}
    *   Arrays.asList(clazz).contains(xxx)
    * */
    public static void main(String[] args) {
        String path = getPath("city.xml");
        SAXReader reader = new SAXReader();
        List array = new ArrayList();
        try {
            Document document = reader.read(path);
            Element root = document.getRootElement();
            String classPath = root.attributeValue("class");
            Class clazz = Class.forName(classPath);
            Constructor constructor = clazz.getConstructor();// 获取无参构造
            Iterator<Element> elementIterator = root.elementIterator();
            Element element;
            Attribute attribute;
            Field field;
            Class c;
            Method method;
            while (elementIterator.hasNext()){
                element = elementIterator.next();
                Object o = constructor.newInstance();// 调用无参构造创建对象
                // 给对象赋值
                Iterator<Attribute> attributeIterator = element.attributeIterator();
                while (attributeIterator.hasNext()){
                    attribute = attributeIterator.next();
                    String fieldName = attribute.getName();
                    String fieldValue = attribute.getValue();
                    field = clazz.getDeclaredField(fieldName);
                    c = field.getType();
                    // 构造setter
                    String setterMethodName = String.format("set%s",capitalize(fieldName));
                    method = clazz.getMethod(setterMethodName,c);
                    String simpleName = c.getSimpleName();
                    System.out.println(simpleName);
                    switch (simpleName){
                        case "String":
                            method.invoke(o,fieldValue);
                            break;
                        case "Character":
                            method.invoke(o,fieldValue.charAt(0));
                            break;
                        default:
                            // 数字类型
                            Class<? extends Number> c2 = c.asSubclass(Number.class);
                            Number n = c2.getConstructor(String.class).newInstance(fieldValue);
                            method.invoke(o,n);
                            break;
                    }
                }
                array.add(o);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (NoSuchMethodException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InvocationTargetException e){
            e.printStackTrace();
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }catch (ClassCastException e){
            e.printStackTrace();
        }finally {
            System.out.println(array);
        }
    }

    static String capitalize(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
    // 获取路径
    static String getPath(String filename){
        return Reflect.class.getResource("").getPath() + "/" + filename;
    }





}

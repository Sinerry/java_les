package com.sinerry.collection.map;




import java.util.Comparator;
import java.util.TreeMap;

public class JavaTreeMap {
    /*
    * TreeMap:
    *   HashMap 无序
    *   TreeMap 有序，但是和List的有序不同
    *   TreeMap的有序指的是根据key排序，key是如何排序的呢？
    *   key的类型需要实现Comparable接口
    * 1. 构造
    *       1. 无参构造
    *       2. 有参构造
    *           1. 比较器
    *           2. 复制已有的Map实例
    *
    * 2. 添加/删除/遍历/修改
    *
    *
    *
    * */
    public static void main(String[] args) {
        /*Map<Integer,Book> map = new TreeMap();
        map.put(5,new Book("lucy",21));
        map.put(3,new Book("rose",20));
        map.put(4,new Book("jack",22));
        map.put(8,new Book("mary",19));

        System.out.println(map.keySet());// 键集
        System.out.println(map.values());// 值集合
        System.out.println(map.entrySet());// 键值对集
        */

        /*TreeMap<Id,Book> map = new TreeMap<>();
        // 增加
        map.put(new Id(2),new Book("lucy",21));
        map.put(new Id(5),new Book("jack",20));
        map.put(new Id(4),new Book("rose",22));
        map.put(new Id(8),new Book("jennifer",19));
        map.put(new Id(3),new Book("peter",23));

        // 删除
        map.remove(new Id(3));    调用比较器的compare方法或者可比较对象compareTo方法
        */


        Comparator comparator = (Object o1,Object o2) -> {
            if(o1 instanceof BaseId && o2 instanceof BaseId) {
                  BaseId b1 = (BaseId)o1;
                  BaseId b2 = (BaseId)o2;
                  return b1.i - b2.i;
            }
            return -1;
        };
        TreeMap<BaseId,User> map = new TreeMap<>(comparator);

        map.put(new BaseId(4),new User("david",18));
        map.put(new BaseId(9),new User("mary",18));
        map.put(new BaseId(6),new User("sunny",18));
        map.put(new BaseId(2),new User("jerry",18));
        map.put(new BaseId(5),new User("james",18));
        System.out.println(map);


        // 复制已有的map
        TreeMap<BaseId,User> map2 = new TreeMap<>(map);
        System.out.println(map2);






    }


    static class BaseId {
        protected Integer i;
        public BaseId(Integer i) {
            this.i = i;
        }
        @Override
        public String toString() {
            return String.format("%d",i);
        }
    }
    static class Id extends BaseId implements Comparable {
        public Id(Integer i) {
            super(i);
        }
        @Override
        public int compareTo(Object o) {
            if(o instanceof Id) {
                Id id = (Id)o;
                return i - id.i;
            }
            throw new ClassCastException();
        }

    }
    static class User {
        private String name;
        private Integer age;

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

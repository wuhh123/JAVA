package java_study.Collection;

import java.util.LinkedList;

public class List002 {
    public static void main(String[] args) {
        LinkedList link=new LinkedList();
        link.add("stu1");
        link.add("stu2");
        link.add("stu3");
        link.add("stu4");
        System.out.println("新增加4个元素创建集合"+link.toString());
        link.add(3,"student");
        System.out.println("在位置3新加元素:"+link.toString());
        link.addFirst("teacher");
        System.out.println("在集合头部新添加元素"+link.toString());
        System.out.println("取出该集合中的第一个元素"+link.getFirst());
        link.remove(3);
        System.out.println("移除该集合中第三个元素之后:"+link.toString());
        link.removeFirst();
        System.out.println("移除该集合中第一个元素之后:"+link.toString());
    }
}

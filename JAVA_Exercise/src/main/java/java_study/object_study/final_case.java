package java_study.object_study;
//被final修饰的类不能被继承和重写，被修饰的变量为常量
class Student{
    final String name="哈哈";
    public void introduce(){
        System.out.println("学生的名字叫做"+name);
    }
}

public class final_case {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.introduce();
    }
}

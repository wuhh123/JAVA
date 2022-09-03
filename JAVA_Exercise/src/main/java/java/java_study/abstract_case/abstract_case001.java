package java.java_study.abstract_case;
//一个类的方法实现无法确定时，需要定义抽象类和抽象方法
abstract class Animal{
    abstract void shout();
}

//抽象方法不能被实例化和调用，可以写个子类进行实例化和调用
class Dog extends Animal{
    void shout(){
        System.out.println("小狗喵喵叫");
    }
}

public class abstract_case001 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.shout();
    }
}

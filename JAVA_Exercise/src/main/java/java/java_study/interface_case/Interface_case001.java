package java.java_study.interface_case;
//先定义接口，接口都是抽象类，不能被实例化和调用。接口中定义的量都是全局变量
interface Animal{
    int ID=1;  //定义全局变量
    void breathe();  //定义抽象方法
    void run();   //定义抽象方法
}

//重新定义一个类，然后通过implements来使用接口中的方法
class Dog implements Animal{
    public void breathe() {
        System.out.println("狗在呼吸！");
    }
    public void run(){
        System.out.println("狗在跑！");
    }
}

public class Interface_case001 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.breathe();
        dog.run();
    }
}

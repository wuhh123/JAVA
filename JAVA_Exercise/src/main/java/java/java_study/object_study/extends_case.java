package java.java_study.object_study;
class Animal{
    String name="动物";
    void shout(){
        System.out.println("动物叫！");
    }
}

class Dog extends Animal{
    String name="狗" ;
//    叫声方法
    void shout(){
        super.shout();   //调用父类方法
//        方法重写
//        System.out.println("喵喵喵~");
    }
//    打印动物名称
    void printname(){
        System.out.println("动物是"+super.name);
    }
}

public class extends_case {
    public static void main(String[] args) {
        Dog dog=new Dog();
//        调用叫声方法
        dog.shout();   //预期输出父类方法+重新方法的方法，先super调用父类方法，有个输出，然后本身有个输出
//        调用打印名称方法
        dog.printname();  //预期输出父类名称：动物
    }
}

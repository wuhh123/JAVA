package java.java_study.object_study;
class Animals{
    public Animals(){
        System.out.println("这是一个动物");
    }
    public Animals(String name){
        System.out.println("这是一个有参数的"+name);
    }
}

class Dog_002 extends Animals{
    public Dog_002(){
    }
}

public class extends_case002 {
    public static void main(String[] args) {
        Dog_002 dog002=new Dog_002();  //        调用无参方法
    }
}

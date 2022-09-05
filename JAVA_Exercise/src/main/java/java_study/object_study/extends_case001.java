package java_study.object_study;
class Animal_001 {
    public Animal_001(String name) {
        System.out.println("这个动物是" + name);
    }
}

class Dog_001 extends Animal_001 {
    public Dog_001() {
        super("沙皮狗");
    }
}

public class extends_case001 {
    public static void main(String[] args) {
       Dog_001 dog001=new Dog_001();
    }

}


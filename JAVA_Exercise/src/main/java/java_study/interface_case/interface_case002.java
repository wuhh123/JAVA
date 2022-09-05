package java_study.interface_case;
interface Animal002{
    int ID=1;
    void breathe();
    void run();
}

interface LandAnimal extends Animal002{
    void liveOnland();
}

class Dog001 implements LandAnimal{
    public void breathe() {
        System.out.println("狗在呼吸！");
    }

    public void run() {
        System.out.println("狗在跑！");
    }
    public void liveOnland() {
        System.out.println("狗生活在陆地上！");
    }
}

public class interface_case002 {
    public static void main(String[] args) {
        Dog001 dog=new Dog001();
        dog.breathe();
        dog.run();
        dog.liveOnland();
    }
}

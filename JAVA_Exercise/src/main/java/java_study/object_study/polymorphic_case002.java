package java_study.object_study;
interface polymorphic_Animals001{
    public void shout();
}

class Cat002 implements polymorphic_Animals001{
    public void shout(){
        System.out.println("喵喵~~");
    }
    public void sleep(){
        System.out.println("小猫呼呼睡觉！");
    }
}


public class polymorphic_case002 {
    public static void main(String[] args) {
        Cat002 cat=new Cat002();
        animalShout(cat);
    }
    public static void animalShout(polymorphic_Animals001 an001){
        Cat002 cat=(Cat002) an001;
        cat.shout();
        cat.sleep();

    }
}

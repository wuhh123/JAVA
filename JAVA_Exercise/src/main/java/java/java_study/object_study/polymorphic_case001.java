package java.java_study.object_study;
interface polymorphic_Animal{
    void shout();
}

class polymorphic_dog implements polymorphic_Animal{
    public void shout(){
        System.out.println("小狗汪汪！");
        }
}

class polymorphic_cat implements polymorphic_Animal{
    public void shout(){
        System.out.println("小猫喵喵！");
    }
}

public class polymorphic_case001 {
    public static void main(String[] args) {
        polymorphic_Animal an1=new polymorphic_cat();
        polymorphic_Animal an2=new polymorphic_dog();
        an1.shout();
        an2.shout();
    }

    public static void main(polymorphic_Animal an) {
        an.shout();
    }
}

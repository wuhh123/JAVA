package java_study.claass_study;

public class class_case008 {
    public static void main(String[] args) {
        int number=100;
        System.out.println("调用change方法前:"+number);
        change(number); //形参
        System.out.println("调用change方法后:"+number);
    }
    public static void change(int number){
        number=200;
//        return number;
    }
}

package java_study.claass_study;

public class class_case009 {
    public static void main(String[] args) {
//        方法参数传递(引用类型)
        int[] arr={10,20,30};
        System.out.println("调用change方法前:"+arr[1]);
        change(arr);
        System.out.println("调用change方法后:"+arr[1]);
    }
    public static void change(int[] arr){
        arr[1]=200;
    }
}

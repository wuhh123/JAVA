package java_study.claass_study;

public class class_case001 {
    public static void main(String[] args) {
//        方法调用
        class_001();
    }
//    写新方法
    public static void class_001(){
//        三者取最大值
    int [] arr=new int[]{11,23,9};
    int max=arr[0];
    for (int i=0;i<arr.length;i++){
        if (max<arr[i]){
            max=arr[i];
        }else{
            continue;
        }
    }
        System.out.println(max);
    }
}

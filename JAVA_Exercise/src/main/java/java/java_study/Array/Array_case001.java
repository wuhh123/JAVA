package java.java_study.Array;

public class Array_case001 {
    public static void main(String[] args) {
        int [] arr001=new int[] {1,2,3};
//        输出地址符
//        System.out.println(arr001);
//        输出具体数据值
        System.out.println(arr001[0]);
        System.out.println(arr001[1]);
        System.out.println(arr001[2]);
//        索引越界
//        System.out.println(arr001[3]);

        int [] arr002=new int[3];
        arr002=null;
        System.out.println(arr002[0]);
    }
}

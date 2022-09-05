package java_study.claass_study;

public class class_case010 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        printArray(arr);
        System.out.println();
    }
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
}

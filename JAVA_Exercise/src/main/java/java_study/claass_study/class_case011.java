package java_study.claass_study;

public class class_case011 {
    public static void main(String[] args) {
        int[] Arr={12,11,33,66,55};
        MAX(Arr);
        System.out.println(Arr);
    }
    public static void MAX(int[] arr){
        for (int i=0;i<arr.length;i++){
            int max;
            if (arr[i+1]>arr[i]){
                max=arr[i+1];
            }else{
                max=arr[i];
            }
        }
    }
}

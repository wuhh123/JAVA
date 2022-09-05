package java_study.Array;

public class Array_case003 {
    public static void main(String[] args) {
        int [] arr004=new int[]{11,23,4,5,67,88,100,101};
        int max=arr004[0];
        for (int i=0;i<arr004.length;i++){
            if (arr004[i]>max){
                max=arr004[i];
            }
        }
        System.out.println(max);
    }
}

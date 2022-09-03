package java.java_study.case_exercise;

public class daffodils {
    public static void main(String[] args) {
        int count=0;
        for (int i=100;i<=999;i++){
            int a=0;int b=0;int c=0;
            a=i%10;  // 987%10得个位
            b=(i/10)%10; //   987/10=98.7 再求余10,得到十位
            c=(i/100)%10;  //  987/100=9.87 再求余,得百位
            if (i==a*a*a+b*b*b+c*c*c){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}

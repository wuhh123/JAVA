package java_study.JavaApi;

import java.util.Random;

public class JavaApi014 {
    public static void main(String[] args) {
//        生成相同的随机数
        Random r=new Random(15);
        for (int i=0;i<10;i++){
            System.out.println(r.nextInt(100));
        }
    }
}

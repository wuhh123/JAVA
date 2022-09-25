package java_study.JavaApi;

import java.util.Random;

public class JavaApi013 {
//    Random类
//    随机产生10个100以内的整数
public static void main(String[] args) {
    Random r=new Random();
    for (int x=0;x<10;x++){
        System.out.println(r.nextInt(100));
    }
}
}

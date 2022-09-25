package java_study.JavaApi;

import java.util.Random;

public class JavaApi015 {
    public static void main(String[] args) {
        Random r1=new Random();
        System.out.println("产生boolean类型的随机数:"+r1.nextBoolean());
        System.out.println("产生float类型的随机数:"+r1.nextFloat());
        System.out.println("产生0-100之间int类型的随机数:"+r1.nextInt(100));
        System.out.println("产生double类型的随机数:"+r1.nextDouble());

    }
}

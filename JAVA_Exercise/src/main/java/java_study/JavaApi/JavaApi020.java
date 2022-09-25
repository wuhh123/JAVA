package java_study.JavaApi;

import java.util.Scanner;

public class JavaApi020 {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.println("输入长:");
        int w=scan.nextInt();
        System.out.println("输入宽:");
        int h=scan.nextInt();
        for (int i=0;i<h;i++){
            StringBuffer sb=new StringBuffer();
            for (int j=0;j<w;j++){
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}

package java_study.case_exercise;

import java.util.Random;
import java.util.Scanner;

public class Random_case {
    public static void main(String[] args) {
        Random r = new Random();
//        获取的是一个数，nextInt中控制的是这个随机数的范围
        int number = r.nextInt(49);
//        每个人可以猜五次机会
        int count=0;
            while (count<5) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入你要猜测的数字:");
                int guessnumber = sc.nextInt();
                if (guessnumber > number) {
                    System.out.println("你猜测的数字大了。");
                    count++;
                    System.out.println("亲，你已经使用了"+count+"次机会了！");
                    continue;
                } else if (guessnumber < number) {
                    System.out.println("你猜测的数字小了。");
                    count++;
                    System.out.println("亲,你已经使用了"+count+"次机会了！");
                    continue;
                } else {
                    System.out.println("恭喜你猜对了!!!");
                    count++;
                    System.out.println("亲,你已经使用了"+count+"次机会了!");
                    break;
                }
            }
        System.out.println("你的次数被用光了！！");
        };
    }


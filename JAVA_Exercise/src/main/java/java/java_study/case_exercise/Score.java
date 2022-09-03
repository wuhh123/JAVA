package java.java_study.case_exercise;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("小明，请输入你的分数:");
        int Score=sc.nextInt();
        if (Score==100){
            System.out.println("奖品是1");
        }else if(Score >= 90 &Score<100){
            System.out.println("奖品是2");
        }else if (Score >= 80 &Score<90){
            System.out.println("奖品是3");
        }else if(Score >= 60 &Score<80){
            System.out.println("奖品是4");
        }else{
            System.out.println("挨打！");
        }
    }
}

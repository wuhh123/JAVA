package java.java_study.case_exercise;

import java.util.Scanner;

public class Score001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("小明，请输入你的分数:");
        int Score01= sc.nextInt();
        switch (Score01){
            case 100:
                System.out.println("很棒！");
                break;
            case 90:
                System.out.println("优秀！");
                break;
            case 80:
            case 70:
                System.out.println("很好！");
                break;
            case 60:
                System.out.println("挨打！");
                break;
        }
    }
}

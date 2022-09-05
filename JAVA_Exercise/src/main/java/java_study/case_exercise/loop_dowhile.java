package java_study.case_exercise;

public class loop_dowhile {
    public static void main(String[] args) {
        int i=0;
       do{
         i++;
         if(i==3){
//             跳转控制语句
//             break;
             continue;
         }
         System.out.println("这是第"+i+"次循环;");
       }while (i<5);
    }
}

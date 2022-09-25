package java_study.JavaApi;
//时间戳：currentTimeMillis()方法返回一个long类型的值，该值表示当前时间与1970年1月1日0时0分0秒之间的时间差，单位是毫秒，习惯性被叫做时间戳。
public class JavaApi009 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        int sum=0;
        for (int i=0;i<100000000;i++){
            sum+=i;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间为:"+(endTime-startTime)+"毫秒");
    }
}

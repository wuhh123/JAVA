package java_study.JavaApi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaApi027 {
    public static void main(String[] args) {
//        创建一个simpleDateFormat对象
        SimpleDateFormat df1=new SimpleDateFormat("Gyyyy年MM月dd日：今天是yyyy年的第D天，E");
//        按SimpleDateFormat对象的日期模板格式化Date对象
        System.out.println(df1.format(new Date()));
    }
}

package java_study.JavaApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JavaApi028 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df2=new SimpleDateFormat("yyyy/MMMM/dd");
        String dt="2012/八月/03";
//      将字符串解析成Date对象
        System.out.println(df2.parse(dt));
    }
}

package java_study.JavaApi;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class JavaApi026 {
    public static void main(String[] args) throws ParseException {
        DateFormat df1=DateFormat.getDateInstance(DateFormat.LONG);
        String d1="2008年8月8日";
        System.out.println(df1.parse(d1));
    }
}

package java_study.JavaApi;

import java.util.Calendar;

public class JavaApi024 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(2022,7,8);
        calendar.add(Calendar.DATE,100);
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int date=calendar.get(Calendar.DATE);
        System.out.println("竣工时间为:"+year+"年"+month+"月"+date+"日");
    }
}

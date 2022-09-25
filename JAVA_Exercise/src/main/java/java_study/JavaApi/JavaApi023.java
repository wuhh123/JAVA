package java_study.JavaApi;

import java.util.Calendar;

public class JavaApi023 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int date=calendar.get(Calendar.DATE);
        int hour=calendar.get(Calendar.HOUR)+12;
        int minute=calendar.get(Calendar.MINUTE);
        int second=calendar.get(Calendar.SECOND);
//        System.out.println(calendar);
        System.out.println("当前时间为"+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
    }
}

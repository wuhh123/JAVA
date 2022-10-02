package java_study.JavaApi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaApiExercise004 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(2022,9,25);
        calendar.add(Calendar.DATE,100);
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int date=calendar.get(Calendar.DATE);
        System.out.println("100天后是"+year+"年"+month+"月"+date+"日");
    }
}

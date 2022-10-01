package java_study.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Interator002 {
    public static void main(String[] args) {
//        逆向遍历
        ArrayList list=new ArrayList();
        list.add("date1");
        list.add("date2");
        list.add("date3");
        System.out.println(list);
        ListIterator it=list.listIterator(list.size());
        while (it.hasPrevious()){
            Object obj=it.previous();
            System.out.println(obj+"");
        }
    }
}

package java_study.Collection;

import java.util.*;

public class Interator001 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("data_01");
        list.add("date_02");
        list.add("date_03");
        list.add("date_04");
        Iterator it=list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }

    }
}

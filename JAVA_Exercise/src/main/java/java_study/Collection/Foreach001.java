package java_study.Collection;

import java.util.ArrayList;

public class Foreach001 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("jack");
        list.add("Rose");
        list.add("Tom");
        for (Object obj:list) {
            System.out.println(obj);
        }
    }
}

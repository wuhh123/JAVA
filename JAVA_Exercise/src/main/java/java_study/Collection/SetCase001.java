package java_study.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCase001 {
    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add("Jack");
        set.add("Eve");
        set.add("Rose");
        set.add("Rose");
        set.add("Jack");
        set.add("Winner");
        Iterator iterator_set001= set.iterator();
        while (iterator_set001.hasNext()){
            Object obj_set001=iterator_set001.next();
            System.out.println(obj_set001);
        }
    }
}

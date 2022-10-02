package java_study.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCase001 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add("Jack");
        ts.add("Winnie");
        ts.add("Eva");
        ts.add("Haaaa");
        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

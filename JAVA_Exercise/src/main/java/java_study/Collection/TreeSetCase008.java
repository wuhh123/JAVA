package java_study.Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetCase008 {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();
        tm.put("1","jack");
        tm.put("2","Rose");
        tm.put("3","Lucy");
        tm.put("4","Winnie");
        Set keySet=tm.keySet();
        Iterator iterator_treeSetCase003=keySet.iterator();
        while (iterator_treeSetCase003.hasNext()){
            Object key=iterator_treeSetCase003.next();
            Object value=tm.get(key);
            System.out.println(key+":"+value);
        }

    }
}

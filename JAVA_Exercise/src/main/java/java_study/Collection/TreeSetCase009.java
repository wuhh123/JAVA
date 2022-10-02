package java_study.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetCase009 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new MyComparatorCase());
        tm.put("1", "jack");
        tm.put("2", "Rose");
        tm.put("3", "Winnie");
        tm.put("4", "Lucy");
        Set keySet = tm.keySet();
        Iterator it_setCase004 = keySet.iterator();
        while (it_setCase004.hasNext()) {
            Object key = it_setCase004.next();
            Object value = tm.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
    class MyComparatorCase implements Comparator{
        public int compare(Object obj1,Object obj2){
            String id1=(String) obj1;
            String id2=(String) obj2;
            return id2.compareTo(id1);
        }
    }


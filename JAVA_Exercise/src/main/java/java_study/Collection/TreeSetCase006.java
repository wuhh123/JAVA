package java_study.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TreeSetCase006 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("2","jack");
        map.put("1","Rose");
        map.put("3","Lucy");
        map.put("4","Winnie");
        Collection values=map.values();
        Iterator iterator_treeSetCase001=values.iterator();
        while (iterator_treeSetCase001.hasNext()){
            Object value=iterator_treeSetCase001.next();
            System.out.println(value);
        }
    }
}

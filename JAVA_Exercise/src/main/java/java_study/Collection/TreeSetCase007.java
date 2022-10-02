package java_study.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TreeSetCase007 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        map.put("2","jack");
        map.put("3","Rose");
        map.put("1","Winnie");
        map.put("4","Lucy");
        Set keySet=map.keySet();
        Iterator iterator_treeSetCase002=keySet.iterator();
        while (iterator_treeSetCase002.hasNext()){
            Object key=iterator_treeSetCase002.next();
            Object value=map.get(key);
            System.out.println(key+":"+value);
        }
    }
}

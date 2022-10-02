package java_study.Collection;

import java.util.HashMap;
import java.util.Map;

public class Map_case001 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("1","Jack");
        map.put("2","Rose");
        map.put("3","Lucy");
        map.put("3","Winnie");
        System.out.println("1:"+map.get("1"));
        System.out.println("2:"+map.get("2"));
        System.out.println("3:"+map.get("3"));
    }
}

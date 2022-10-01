package java_study.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enmueration001 {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("jack");
        v.add("Rose");
        v.add("Tom");
        Enumeration en=v.elements();
        while (en.hasMoreElements()){
            Object obj=en.nextElement();
            System.out.println(obj);
        }
    }
}

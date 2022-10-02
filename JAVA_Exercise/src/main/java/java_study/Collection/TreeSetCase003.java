package java_study.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
      String s1=(String) obj1;
      String s2=(String) obj2;
      int temp=s1.length()-s2.length();
      return temp;
    }
}
//如果名字长度相同，去后者
public class TreeSetCase003 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet(new MyComparator());
        ts.add("Jack");
        ts.add("Rosey");
        ts.add("Winnie");
        ts.add("Saiki");
        Iterator it=ts.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }
    }
}

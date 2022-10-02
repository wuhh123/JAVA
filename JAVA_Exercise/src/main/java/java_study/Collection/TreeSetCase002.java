package java_study.Collection;

import java.util.Iterator;
import java.util.TreeSet;

class StudentSet implements Comparable{
    String name;
    int age;
    public StudentSet(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+":"+age;
    }
    public int compareTo(Object obj){
        StudentSet s=(StudentSet) obj;
        if (this.age-s.age>0){
            return 1;
        }
        if (this.age-s.age==0){
            return this.name.compareTo(s.name);
        }
        return -1;
    }

//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}

public class TreeSetCase002 {
    public static void main(String[] args) {
        TreeSet ts_set001=new TreeSet();
        ts_set001.add(new StudentSet("Jack",19));
        ts_set001.add(new StudentSet("Rose",18));
        ts_set001.add(new StudentSet("ATom",19));
        ts_set001.add(new StudentSet("Rose",18));
        ts_set001.add(new StudentSet("Winner",27));
        Iterator it_set001=ts_set001.iterator();
        while (it_set001.hasNext()){
            System.out.println(it_set001.next());
        }
    }
}

//package java_study.Collection;
//
//import java.util.HashSet;
//
//class Student01{
//    private String id;
//    private String name;
//    private void StudentCase001(String id, String name){
//        this.id=id;
//        this.name=name;
//    }
////    重写toString()方法
//    public String toString(){
//        return id+":"+name;
//    }
////    重写hashCode方法
//    public int hashCode(){
//        return id.hashCode();
//    }
////    重写equals方法
//    public boolean equals(Object obj){
//        if (this==obj){
//            return true;
//        }
//        if (!(obj instanceof Student01)){
//            return false;
//        }
//        Student01 stu=(Student01) obj;
//        boolean b=this.id.equals(stu.id);
//        return b;
//    }
//}
//
//public class SetCase003 {
//    public static void main(String[] args) {
//        HashSet hs01=new HashSet();
//        Student01 stu1=new Student01();
//        Student01 stu2=new Student01();
//        Student01 stu3=new Student01();
//        hs01.add(stu1);
//        hs01.add(stu2);
//        hs01.add(stu3);
//        System.out.println(hs01);
//    }
//}

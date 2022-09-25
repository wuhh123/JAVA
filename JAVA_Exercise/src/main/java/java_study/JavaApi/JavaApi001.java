package java_study.JavaApi;

public class JavaApi001 {
    public static void main(String[] args) {
//        创建一个String类型的对象
      String str1=new String();
//      常见String类型的对象2并赋值
      String str2=new String("abcd");
//      创建一个内容为字符数组的字符串
      char[] charArray=new char[]{'D','E','F'};
      String str3=new String(charArray);
        System.out.println(str1+"a");
        System.out.println(str2);
        System.out.println(str3);
    }
}

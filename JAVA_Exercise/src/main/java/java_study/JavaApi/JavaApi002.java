package java_study.JavaApi;

public class JavaApi002 {
    public static void main(String[] args) {
        String s="abcddcba";
//        长度
        System.out.println("字符串的长度为:"+s.length());
        System.out.println("字符串的第一个字符"+s.charAt(0));
        System.out.println("字符C第一次出现的位置"+s.indexOf('c'));
        System.out.println("字符C最后一次出现的位置"+s.lastIndexOf('c'));
    }


}

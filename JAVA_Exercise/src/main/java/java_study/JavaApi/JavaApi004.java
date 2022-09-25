package java_study.JavaApi;

public class JavaApi004 {
    public static void main(String[] args) {
//        字符串的替换
        String s="itcast";
        System.out.println("将it成ABC");
        String T=s.replace("it","ABC");
        System.out.println(T);
//        去除空格
        String s1=" h j k l";
        System.out.println("去除空格");
//        去除字符串两端空格
        String T1=s1.trim();
        System.out.println(T1);
//        去除字符串中间空格
        String T2=s1.replace(" ","");
        System.out.println(T2);
    }
}

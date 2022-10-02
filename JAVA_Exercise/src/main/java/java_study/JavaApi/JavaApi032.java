package java_study.JavaApi;

public class JavaApi032 {
    public static void main(String[] args) {
        System.out.println((int)(20+Math.random()*97));
        System.out.println(20+(int)(Math.random())*980);
        System.out.println((int)Math.random()*999);
        System.out.println(20+(int)Math.random()*980);
        System.out.println(Math.floor(-4.4));
        StringBuffer stringBuffer001=new StringBuffer("beijing2008");
        stringBuffer001.insert(7,"@");
        System.out.println(stringBuffer001.toString());
        int i;
        float f=2.3f;
        double d=2.7;
        i=((int)Math.ceil(f)*((int)Math.round(d)));
        System.out.println(i);
    }
}

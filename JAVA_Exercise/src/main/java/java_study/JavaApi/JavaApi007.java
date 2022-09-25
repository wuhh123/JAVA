package java_study.JavaApi;

public class JavaApi007 {
    public static void main(String[] args) {
        System.out.println("1、添加-------");
        add();
        System.out.println("2、删除------");
        remove();
        System.out.println("3、修改------");
        alter();
    }
//    添加
    public static void add(){
        StringBuffer sb=new StringBuffer();
//        在字符串末尾添加
        sb.append("abcdefg");
        System.out.println("append在末尾添加字符串后的结果是:");
//        在字符串中间插入
        sb.insert(2,"iii");
        System.out.println("insert插入字符串后的结果:");
    }
//    删除
    public static void remove(){
        StringBuffer sb01=new StringBuffer("abc123");
//        在指定范围内删除
        sb01.delete(1,3);
        System.out.println("删除指定范围字符串后的结果为:"+sb01);
        sb01.deleteCharAt(2);
        System.out.println("删除指定位置字符串后的结果为:"+sb01);
        sb01.delete(0,sb01.length());
        System.out.println("清空缓存区");
    }

//    修改
    public static void alter(){
        StringBuffer sb03=new StringBuffer("123456789");
        sb03.setCharAt(1,'p');
        System.out.println("修改指定位置字符结果:"+sb03);
//        替换指定位置字符、字符串
        sb03.replace(1,3,"qq");
        System.out.println("替换指定位置字符串的结果为:"+sb03);
    }
}

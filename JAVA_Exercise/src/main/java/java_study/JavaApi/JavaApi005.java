package java_study.JavaApi;

public class JavaApi005 {
    public static void main(String[] args) {
        String string01="HelloWord";
        System.out.println("判断是否以字符串开头:"+string01.startsWith("str"));
        System.out.println("判断是否以某个字符串结尾:"+string01.endsWith("World"));
        System.out.println("判断是否包含某个字符串"+string01.contains("Hello"));
        System.out.println("判断字符串是否为空:"+string01.isEmpty());
        System.out.println("判断两个字符串是否相等:"+string01.equals("huairen"));
    }
}

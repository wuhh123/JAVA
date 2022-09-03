package java.java_study.home_work;
public class case_3_9 {
    public static class Test0309{
        public Test0309(){
            System.out.println("构造方法一被调用了");
        }
        public Test0309(int x){
            this();
            System.out.println("构造方法二被调用了");
        }
        public Test0309(boolean b){
            this(1);
            System.out.println("构造方法三被调用了");
        }
    }
    public static void main(String[] args) {
        Test0309 test=new Test0309(true);
    }

}

package java.java_study.ThreadCase;

public class Thread_case001 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.run();
        while (true){
            System.out.println("Main方法在运行");
        }
    }
    static class MyThread{
        public void run(){
            while (true){
                System.out.println("MyThread类的run()方法在运行");
            }
        }
    }
}

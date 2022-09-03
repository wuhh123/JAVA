package java.java_study.ThreadCase;
//创建多线程
public class Thread_case003 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        thread.start();
        while (true){
            System.out.println("main方法在运行");
        }
    }
    static class MyThread implements Runnable {
        public void run(){
            while (true){
                System.out.println("MyThread类的run方法在运行");
            }
        }
    }
}

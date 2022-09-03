package java.java_study.ThreadCase;

public class Thread_case002 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        while(true){
            System.out.println("main方法在运行");
        }
    }
    static class MyThread extends Thread {
        public void run(){
            while (true){
                System.out.println("MyThread类的run()方法在运行");
            }
        }
    }
}

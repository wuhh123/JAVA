package java_study.ThreadCase;
//线程让步
class YieldThread extends Thread{
    public YieldThread(String name){
        super(name);
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"---"+i);
            if (i==3){
                System.out.println("线程让步:");
                Thread.yield();    //线程运行到此，作出让步
            }
        }
    }
}

public class Thread_case007 {
    public static void main(String[] args) {
//        创建两个线程
        Thread t1=new YieldThread("线程A");
        Thread t2=new YieldThread("线程B");
//        开启两个线程
        t1.start();
        t2.start();

    }
}

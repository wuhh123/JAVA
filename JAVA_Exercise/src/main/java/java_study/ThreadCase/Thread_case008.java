package java_study.ThreadCase;

class DeadLockThread implements Runnable{
    static Object chopsticks=new Object();
    static Object knifeAndFork=new Object();
    private boolean flag;
    DeadLockThread(boolean flag){
        this.flag=flag;
    }
    public void run(){
        if (flag){
            while (true){
                synchronized (chopsticks){
//                    chopsticks锁对象上的同步代码块
                    System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
                }
                synchronized (knifeAndFork){
//                    knifeAndFork锁对象上的同步代码块
                    System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
                }
            }
        }else{
            while (true){
                synchronized (knifeAndFork){
                    System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
                }
                synchronized (chopsticks){
                    System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
                }
            }
        }
    }
}
public class Thread_case008 {
//    创建两个DeadLockThread对象
    public static void main(String[] args) {
     DeadLockThread d1=new DeadLockThread(true);
     DeadLockThread d2=new DeadLockThread(false);
//     创建并开启两个进程
     new Thread(d1,"Chinese").start();
     new Thread(d2,"American").start();
    }
}

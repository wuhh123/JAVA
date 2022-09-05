package java_study.ThreadCase;

public class Thread_case005 {
    public static void main(String[] args) {
        //    创建两个线程
        Thread minPriority=new Thread(new MinPriority(),"优先级较低的线程");
        Thread maxPriority=new Thread(new MaxPriority(),"优先级较高的线程");
        minPriority.setPriority(Thread.MIN_PRIORITY);
        maxPriority.setPriority(10);
    //    开启两个线程
        maxPriority.start();
        minPriority.start();
    }

}
class MaxPriority implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"正在输出"+i);
        }
    }
}
class MinPriority implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"正在输出"+i);
        }
    }
}

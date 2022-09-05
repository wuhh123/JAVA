package java_study.ThreadCase;

public class Thread_case006 {
    public static void main(String[] args) throws InterruptedException {
//        线程休眠
        new Thread(new SleepThread()).start();
        for(int i=1;i<=5;i++){
            if (i==3){
                System.out.println("开始休眠2s");
                Thread.sleep(2000);
                System.out.println("休眠2s结束");
            }
            System.out.println("开始休眠0.5s");
            Thread.sleep(500);
            System.out.println("休眠0.5s结束");
            System.out.println("主线程正在输出"+i);
        }
    }
}
class SleepThread implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            if(i==3){
                try{
                    System.out.println("开始休眠3s");
                    Thread.sleep(3000);
                    System.out.println("休眠3s结束");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("线程"+i+"正在输出");
            try{
                System.out.println("开始休眠0.6");
                Thread.sleep(600);
                System.out.println("休眠0.6s结束");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
//两个线程交替执行
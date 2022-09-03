package java.java_study.ThreadCase;

public class Thread_case004 {
    public static void main(String[] args) {
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
        new TicketWindow().start();
    }

    static class TicketWindow extends Thread {
        private int tickets=100;
        public void run(){
            while (true){
                if(tickets>0){
                    Thread th= Thread.currentThread();
                    String th_name=th.getName();
                    System.out.println(th_name+"正在发售第"+tickets--+"张票");
                }
            }
        }
    }
}

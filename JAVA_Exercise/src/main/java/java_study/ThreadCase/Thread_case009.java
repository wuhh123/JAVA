package java_study.ThreadCase;


public class Thread_case009 {
    class Storage{
        private int[] cells=new int[10];
        private int inPos,outPos;
        public void put(int num){
            cells[inPos]=num;
            System.out.println("在cells["+inPos+"]中放入数据---"+cells[inPos]);
            inPos++;
            if (inPos==cells.length)
                inPos=0;
        }
        //    定义一个get()方法从数组中取出数据
        public void get(){
            int data=cells[outPos];
            System.out.println("从celss["+outPos+"]中取出数据"+data);
            outPos++;
            if (outPos==cells.length)
                outPos=0;
        }
        class Input implements Runnable{
            private Storage st;
            private int num;
            Input(Storage st){
                this.st=st;
            }
            public void run(){
                while (true){
                    st.put(num++);
                }
            }
        }
        class Output implements Runnable{
            private Storage st;
            Output(Storage st){
                this.st=st;
            }
            public void run(){
                while (true){
                    st.get();
                }
            }
        }
//        public static void main(String[] args) {
//            Storage st=new Storage();
//            jdk.internal.util.xml.impl.Input input=new jdk.internal.util.xml.impl.Input(st);
//            Output output=new Output(st);
//            new Thread(input).start();
//            new Thread(output).start();
//        }
    }
}


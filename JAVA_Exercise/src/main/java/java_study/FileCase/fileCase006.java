package java_study.FileCase;

import java.io.RandomAccessFile;

public class fileCase006 {
    public static void main(String[] args) throws Exception {
        RandomAccessFile raf=new RandomAccessFile("time.txt","rw");
        int times=0;
        times=Integer.parseInt(raf.readLine());
        if (times>0){
//            试用一次，次数减少一次
            System.out.println("您还可以试用:"+times--+"次！");
            raf.seek(0);
            raf.writeBytes(times+"");
        }else{
            System.out.println("软件试用次数已用光！");
        }
        raf.close();
    }
}

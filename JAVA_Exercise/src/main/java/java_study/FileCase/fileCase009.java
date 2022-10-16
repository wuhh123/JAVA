package java_study.FileCase;

import java.io.*;

public class fileCase009 {
    public static void main(String[] args) throws Exception{
//        创建InputStreamReader对象
        Reader reader=new InputStreamReader(new FileInputStream("E:\\1.txt"),"GBK");
//        创建OutPutStreamWriter对象
        Writer writer=new OutputStreamWriter(new FileOutputStream("E:\\2.txt",true),"UTF-8");
//        定义一个字符数组
        char[] chs=new char[100];
        int len;
        len=reader.read(chs);
        String string=new String(chs,0,len);
        writer.write(string);
        reader.close();
        writer.close();



    }
}

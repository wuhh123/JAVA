package java_study.FileCase;

import java.io.File;

public class fileCase002 {
    public static void main(String[] args) throws Exception{
//        创建一个file对象
        File file=new File("D:\\JAVA");
        if (file.isDirectory()){
            String[] names=file.list();
            for (String name:names){
                System.out.println(name);
            }
        }
    }
}

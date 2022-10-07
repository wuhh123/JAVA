package java_study.FileCase;

import java.io.File;

public class fileCase004 {
    public static void main(String[] args) {
        File file=new File("D:\\JAVA\\target");
        fileDir(file);
    }
    private static void fileDir(File dir) {
        File[] files=dir.listFiles();
        for (File file:files){
            if(file.isDirectory()){
                fileDir(file);
            }
            System.out.println(file.getAbsolutePath());
        }
    }
}

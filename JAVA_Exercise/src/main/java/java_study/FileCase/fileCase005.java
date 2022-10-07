package java_study.FileCase;

import java.io.File;

public class fileCase005 {
    public static void main(String[] args) {
        File file=new File("E:\\Case");
        deleteDir(file);
    }

    private static void deleteDir(File dir) {
        if (dir.exists()){
            File[] files=dir.listFiles();
            for (File file:files){
                if (file.isDirectory()){
                    deleteDir(file);
                }else{
                    file.delete();
                }
            }
            dir.delete();
        }
    }
}

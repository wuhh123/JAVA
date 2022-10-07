package java_study.FileCase;

import java.io.File;
import java.io.FilenameFilter;

public class fileCase003 {
    public static void main(String[] args) throws Exception {
//        创建File对象
        File file=new File("D:\\JAVA\\JAVA_Exercise\\src\\main\\java\\java_study\\FileCase");
//        创建过滤器对象
        FilenameFilter filter=new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
//                文件以.java结尾返回true,否则返回false
                if (currFile.isFile() && name.endsWith(".java"))
                {
                    return true;
                }else{
                    return false;
                }
            }
        };
        if (file.exists()){
            String[] lists=file.list(filter);
            for (String name:lists){
                System.out.println(name);
            }
        }
    }
}

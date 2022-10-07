package java_study.FileCase;

import java.io.File;

public class fileCase001 {
    public static void main(String[] args) {
//        创建file对象，新建一个文件
        File file=new File("D:\\JAVA\\Test\\case001.txt");
//        获取文件名称
        System.out.println("文件名称:"+file.getName());
//        获取文件相对路径;
        System.out.println("文件的相对路径:"+file.getPath());
//        获取文件的绝对路径
        System.out.println("文件的绝对路径是:"+file.getAbsolutePath());
//        获取文件的父路径
        System.out.println("文件的父路径:"+file.getParent());
//        判断文件是否可读
        System.out.println("文件是否可读："+(file.canRead()?"文件可读":"文件不可读"));
//        判断文件是否可写
        System.out.println("文件是否可写:"+(file.canWrite()?"文件可写":"文件不可写"));
//        判断是否是一个文件
        System.out.println(file.isFile()?"是一个文件":"不是一个文件");
//        判断是否是一个目录
        System.out.println(file.isDirectory()?"是一个目录":"不是一个目录");
//        判断是否是一个绝对路径
        System.out.println(file.isAbsolute()?"绝对路径":"不是绝对路径");
//        判断文件最后的修改时间
        System.out.println("最后修改时间为:"+file.lastModified());
//        文件大小
        System.out.println("文件大小为:"+file.length()+"bytes");
//        是否成功删除文件
//        System.out.println("是否成功删除文件"+file.delete());

    }
}

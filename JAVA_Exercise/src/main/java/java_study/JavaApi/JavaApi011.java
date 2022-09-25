package java_study.JavaApi;

public class JavaApi011 {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        System.out.println("处理器的个数:"+rt.availableProcessors());
        System.out.println("空闲内存数量:"+rt.freeMemory()/1024/1024+"M");
        System.out.println("最大可用内存容量:"+rt.maxMemory()/1024/1024+"M");
    }
}
